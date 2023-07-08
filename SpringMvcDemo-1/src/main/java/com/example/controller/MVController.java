package com.example.controller;

import org.springframework.stereotype.Controller;import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MVController {
	
	@GetMapping("/welcome")
	public ModelAndView Welcomemsg() {
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","Welcome to mvc");
		mav.setViewName("welcome");
		
		return mav;
		
	}
	
	@GetMapping("/good")
	public ModelAndView GoodMorning() {
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","Good morning.....");
		mav.setViewName("morning");
		return mav;
	}
	

}
