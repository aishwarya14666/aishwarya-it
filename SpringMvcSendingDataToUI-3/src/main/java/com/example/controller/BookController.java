package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.bindings.Book;

@Controller
public class BookController {
	
	@GetMapping("/book")
	public String getBooksData(Model model) {
		
		Book b1=new Book(101,"Java",567.00);
		Book b2=new Book(102,"Python",457.00);
		Book b3=new Book(103,"C++",356.00);
		
		List<Book> bookobj=Arrays.asList(b1,b2,b3);
		model.addAttribute("book",bookobj);
		return "book";

}
}
