package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	//ResponseEntity used to send the http response
	@GetMapping("/welcome")
	public ResponseEntity<String> GetWelcomeMsg(){
		String payload="Welcome to RestFull Webservices.....";
		return new ResponseEntity<>(payload,HttpStatus.OK);
	}
	
	//Spring boot will internally generate the http response
	@GetMapping("/greet")
	public String GetGreetMsg() {
		String payload="Good Morning!";
		return payload;
	}

}
