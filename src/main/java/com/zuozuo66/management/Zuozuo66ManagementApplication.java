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
}
