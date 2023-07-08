package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Book;
import com.example.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService service;
	
	@PostMapping("/book")
	public ResponseEntity<String> UpsertBook(@RequestBody Book book){
		String msg=service.UpsertBook(book);
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> GetBooks(){
		List<Book> b=service.getAllBooks();
		return new ResponseEntity<>(b,HttpStatus.OK);
	}
	
	@PutMapping("/book")
	public ResponseEntity<String> UpdateBook(@RequestBody Book book){
		String msg=service.UpsertBook(book);
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	@DeleteMapping("/book/{BookId}")
	public ResponseEntity<String> DeleteBook(@PathVariable Integer BookId){
		String msg=service.deleteBook(BookId);
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}

}
