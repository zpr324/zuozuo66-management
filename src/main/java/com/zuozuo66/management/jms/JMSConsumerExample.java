package com.zuozuo66.management.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JMSConsumerExample  {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    
    private static final String queueName = "queue";
    
    private static final String topicName = "topic";
    
	@JmsListener(destination=queueName)
	public void queueConsumer(String msg) {
		logger.info(">>>>>>>queue consumes msg:"+msg);
		System.out.println(">>>>>>>queue consumes msg:"+msg);
		
	}
	
	@JmsListener(destination=topicName)
	public void topicConsumer1(String msg) {
		logger.info(">>>>>>>topic1 consumes msg:"+msg);
		System.out.println(">>>>>>>topic1 consumes msg:"+msg+"<<<<<<<<<<<<<<");
	}
	
	@JmsListener(destination=topicName)
	public void topicConsumer2(String msg) {
		logger.info(">>>>>>>topic2 consumes msg:"+msg+"<<<<<<<<<<<<<<");
		System.out.println(">>>>>>>topic2 consumes msg:"+msg+"<<<<<<<<<<<<<<");
		
	}

}
