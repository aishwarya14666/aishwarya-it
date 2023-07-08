package com.example.resp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	
	@Value("${welcome.msg}")
	private String welcomemsg;
	
	@GetMapping("/")
	public String GetWelcomeMsg() {
		return welcomemsg;
	}
	
	@Value("${greet.msg}")
	private String greetmsg;
	
	@GetMapping("/greet")
	public String GreetMsg() {
		return greetmsg;
	}

}
