package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableOAuth2Sso
public class SbmsOAuth15Application {

	public static void main(String[] args) {
		SpringApplication.run(SbmsOAuth15Application.class, args);
	}

}
