package com.zuozuo66.management.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JMSConsumerExample  {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    
	@JmsListener(destination="queue")
	public void queueConsumer(String msg) {
		logger.info(">>>>>>>queue consumes msg:"+msg);
		
	}
	
	@JmsListener(destination="topic")
	public void topicConsumer1(String msg) {
		logger.info(">>>>>>>topic1 consumes msg:"+msg);
		
	}
	
	@JmsListener(destination="topic")
	public void topicConsumer2(String msg) {
		logger.info(">>>>>>>topic2 consumes msg:"+msg+"<<<<<<<<<<<<<<");
		
	}

}
