package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
	
	@Autowired
	private WelcomeApiClient welcomeclient;
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		 String greetmsg="Good Morning...!!";
		 String welcomemsg=welcomeclient.invokeWelcomeApi();
		 return greetmsg + welcomemsg;
	}

}
