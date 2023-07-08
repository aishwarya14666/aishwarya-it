package com.example.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prop.AppsProperty;

@RestController
public class DemoRestController {
	
	@Autowired
	private AppsProperty property;

	@GetMapping("/welcome")
	public String GetWelcomeMsg() {
		Map<String, String> messages=property.getMessages();
		String value=messages.get("welcomemsg");
		return value;
	}
	
	@GetMapping("/greet")
	public String GetGreetMsg() {
		Map<String, String> messages=property.getMessages();
		String value=messages.get("greetmsg");
		return value;
	}
	
	@GetMapping("/wish")
	public String GetWishMsg() {
		return property.getMessages().get("wishmsg");
	}
}
