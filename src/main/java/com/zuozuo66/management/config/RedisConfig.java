package com.zuozuo66.management.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.RedisFlushMode;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configuration
@EnableCaching
@EnableRedisHttpSession(redisFlushMode=RedisFlushMode.IMMEDIATE)
public class RedisConfig {
	
    @Bean  
    public JedisConnectionFactory connectionFactory() {  
            return new JedisConnectionFactory();  
    } 
}
