package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/")
	public String getwelcomemsg(Model model) {
		
		model.addAttribute("msg","Welcome to my world....!");
		return "index";
		}

}
