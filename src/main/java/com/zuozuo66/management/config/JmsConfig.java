package com.zuozuo66.management.config;

import javax.jms.ConnectionFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

@Configuration
@EnableJms
public class JmsConfig {
	
	    public final static String TOPIC = "topic";
	    
	    public final static String QUEUE = "queue";
	    
//	    @Bean
//	    public Queue queue() {
//	        return new ActiveMQQueue(QUEUE);
//	    }
//	
//	    @Bean
//	    public Topic topic() {
//	        return new ActiveMQTopic(TOPIC);
//	    }
//	
	    // topic模式的ListenerContainer
	    @Bean
	    public JmsListenerContainerFactory<?> jmsListenerContainerTopic(ConnectionFactory activeMQConnectionFactory) {
	        DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
	        bean.setPubSubDomain(true);
	        bean.setConnectionFactory(activeMQConnectionFactory);
	        return bean;
	    }
	    
	    // queue模式的ListenerContainer
	    @Bean
	    public JmsListenerContainerFactory<?> jmsListenerContainerQueue(ConnectionFactory activeMQConnectionFactory) {
	        DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
	        bean.setConnectionFactory(activeMQConnectionFactory);
	        return bean;
	    }
		
}