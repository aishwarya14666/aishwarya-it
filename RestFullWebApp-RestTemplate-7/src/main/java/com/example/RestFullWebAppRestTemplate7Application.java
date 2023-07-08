package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.client.BookClient;

@SpringBootApplication
public class RestFullWebAppRestTemplate7Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run=SpringApplication.run(RestFullWebAppRestTemplate7Application.class, args);
		
		BookClient bean=run.getBean(BookClient.class);
		//bean.invokeBookTicket();
		//bean.invokeGetBooksOld();
		bean.invokeGetBooksNew();
	}

}
