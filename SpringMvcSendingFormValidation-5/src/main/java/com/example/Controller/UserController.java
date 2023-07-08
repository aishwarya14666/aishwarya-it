package com.example.Controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.bindings.User;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String getFormData(Model model) {
		
		User userobj=new User();
		model.addAttribute("user",userobj);
		return "index";
	}
	
	@PostMapping("/register")
	public String displayFormData(@Valid User userForm,BindingResult result,Model model) {
		
		if(result.hasErrors()) {
			return "index";
		}
		System.out.println(userForm);
		model.addAttribute("msg","Registration Successful.....!");
		return "success";
	}

}
