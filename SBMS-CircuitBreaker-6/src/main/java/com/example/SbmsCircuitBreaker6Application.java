package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Enablehystrix
public class SbmsCircuitBreaker6Application {

	public static void main(String[] args) {
		SpringApplication.run(SbmsCircuitBreaker6Application.class, args);
	}

}
