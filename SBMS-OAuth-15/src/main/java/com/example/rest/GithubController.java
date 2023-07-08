package com.example.rest;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GithubController {
	
	@GetMapping("/")
	public String message(Principal principal) {
		return "Welcome" + principal.getName() + ". You are successfully logged in";
	}

}
