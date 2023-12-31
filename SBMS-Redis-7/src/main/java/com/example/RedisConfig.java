package com.example;

import org.apache.catalina.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfig {
	
	@Bean
	public JedisConnectionFactory getJedisConnection() {
		JedisConnectionFactory factory=new JedisConnectionFactory();
		//factory.setHostName(hostName);
		//factory.setPassword(password);
		//factory.setPort(port);
		return factory;
	}
	
	@Bean
	@Primary
	public RedisTemplate<Integer,User> getRedisTemplate(JedisConnectionFactory factory){
		RedisTemplate<Integer,User> rt=new RedisTemplate<>();
		rt.setConnectionFactory(factory);
		return rt;
	}

}
