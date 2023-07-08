package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.WelcomeService;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private WelcomeService service;
	
	@GetMapping("/welcome")
	public String WelcomeMsg() {
		String msg=service.getMsg();
		return msg;
	}
	

}
