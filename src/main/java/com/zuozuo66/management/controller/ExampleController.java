package com.zuozuo66.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zuozuo66.management.entity.CommonResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/example")
@Api("管理-example")
public class ExampleController {
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Value(value="${spring.activemq.queue.name}")
	private String queueName;
	
	@Value(value="${spring.activemq.topic.name}")
	private String topicName;
	
	@PostMapping("/jms/queue")
	@ApiOperation(value="消息队列用例")
	public CommonResult<Integer> queueExample(String msg){
		try {
			jmsTemplate.convertAndSend(queueName, msg);
		} catch (Exception e) {
			return new CommonResult<Integer>(0);
		}
		return new CommonResult<Integer>(1);
	}
	
	@PostMapping("/jms/topic")
	@ApiOperation(value="发布-订阅消息用例")
	public CommonResult<Integer> topicExample(String msg){
		try {
			jmsTemplate.convertAndSend(topicName, msg);
		} catch (Exception e) {
			return new CommonResult<Integer>(0);
		}
		return new CommonResult<Integer>(1);
	}
	
}
