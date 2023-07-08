package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.WelcomeService;

@SpringBootApplication
public class SbmsSpringSecurityClientApp13Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run=SpringApplication.run(SbmsSpringSecurityClientApp13Application.class, args);
	
	WelcomeService bean=run.getBean(WelcomeService.class);
	
	//bean.invokeWelcomeApi();
	bean.invokeWelcome();
	
	}

}
