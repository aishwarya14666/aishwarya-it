package com.example.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.bindings.Book;
	
@Controller
public class BookController {
	
	@GetMapping("/book")
	public String getBooksData(Model model) {
		
		Book bookobj=new Book(101,"Java",567.00);
		model.addAttribute("book",bookobj);
		return "book";

}
}
