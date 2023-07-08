package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {
	
	@GetMapping("/greet")
	public String GetgreetMsg(Model model) {
		
		String msgtxt="Good morning";
		
		model.addAttribute("msg",msgtxt);
		
		return "greet";
	}

}
