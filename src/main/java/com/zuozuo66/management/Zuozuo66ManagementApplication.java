package com.zuozuo66.management;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.RedisFlushMode;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

import io.swagger.annotations.Api;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.zuozuo66.management.dao")
@EnableSwagger2
@EnableRedisHttpSession(redisFlushMode=RedisFlushMode.IMMEDIATE)
@EnableCaching
public class Zuozuo66ManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(Zuozuo66ManagementApplication.class, args);
	}
	
	@Bean	
    public Docket apiDocket() {
        ApiInfo apiInfo = new ApiInfoBuilder().title("zuozuo66-management")
                .termsOfServiceUrl("").version("1.0")
                .contact(new Contact("name", "zuozuo", "email")).build();
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo).select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class)).paths(PathSelectors.any())
                .build();
    }
	
    @Bean  
    public JedisConnectionFactory connectionFactory() {  
            return new JedisConnectionFactory();  
    }  
    
//    public final static String TOPIC = "topic";
//    public final static String QUEUE = "queue";
//    @Bean
//    public Queue queue() {
//        return new ActiveMQQueue(QUEUE);
//    }
//
//    @Bean
//    public Topic topic() {
//        return new ActiveMQTopic(TOPIC);
//    }
//
//    // topic模式的ListenerContainer
//    @Bean
//    public JmsListenerContainerFactory<?> jmsListenerContainerTopic(ConnectionFactory activeMQConnectionFactory) {
//        DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
//        bean.setPubSubDomain(true);
//        bean.setConnectionFactory(activeMQConnectionFactory);
//        return bean;
//    }
//    // queue模式的ListenerContainer
//    @Bean
//    public JmsListenerContainerFactory<?> jmsListenerContainerQueue(ConnectionFactory activeMQConnectionFactory) {
//        DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
//        bean.setConnectionFactory(activeMQConnectionFactory);
//        return bean;
//    }
//	
//	@Bean  
//    public CorsFilter corsFilter() {  
//        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();  
//        final CorsConfiguration config = new CorsConfiguration();  
//        config.setAllowCredentials(true);  
//        config.addAllowedOrigin("*");  
//        config.addAllowedHeader("*");  
//        config.addAllowedMethod("*");  
//        source.registerCorsConfiguration("*//**", config);  
//        return new CorsFilter(source);  
//    }  
}
