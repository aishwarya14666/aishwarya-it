package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.binding.Book;

@RestController
public class BookController {
	
	//URL : localhost:8080/products
	//Set raw , json in body into postman
	// pass data as {
   // "Id":101,
    //"Name": "Spring",
    //"Price": 500.00
	@PostMapping(value="/book",consumes= {"application/xml","application/json"})
	public ResponseEntity<String> GetBookData(@RequestBody Book book){
		System.out.println(book);
		
		//logic to feed into database
		
		String payload="Book Data created";
		return new ResponseEntity<>(payload,HttpStatus.OK);
		
	}

}
