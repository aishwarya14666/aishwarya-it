package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public ModelAndView Index() {
		ModelAndView mav=new ModelAndView();
			mav.setViewName("index");
			return mav;
		}

}
