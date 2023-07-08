package com.example.prop;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix="apps")
public class AppsProperty {
	
	private Map<String,String> messages=new HashMap<>();

	public Map<String, String> getMessages() {
		return messages;
	}

	@Override
	public String toString() {
		return "AppsProperty [messages=" + messages + "]";
	}

	public AppsProperty() {
		super();
	}

	public AppsProperty(Map<String, String> messages) {
		super();
		this.messages = messages;
	}

	public void setMessages(Map<String, String> messages) {
		this.messages = messages;
	}

}
