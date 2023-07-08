package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.bindings.Book;

@Controller
public class BookController {
	
	@GetMapping("/")
	public String getBook(Model model) {
		
		Book bookobj=new Book();
		model.addAttribute("book",bookobj);
		return "index";
		}
	@PostMapping("/book")
	public String DisplayBook(Book book,Model model) {
		System.out.println(book);
		model.addAttribute("msg","Book data Saved Successfully.....!");
		return "success";
	}

}
