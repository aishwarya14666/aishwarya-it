package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsingPathParam {
	
	//PathParam
	//Passing single parameter
	//URL : localhost:8080/book/Spring
	@GetMapping("/book/{name}")
	public ResponseEntity<String> GetBookName(@PathVariable ("name") String name){
		String payload= name + " Price is 400";
		return new ResponseEntity<>(payload,HttpStatus.OK);
	}
	
	//Passing Multiple parameters
	//URL : localhost:8080/book/bookname/Spring/authorname/Aishwarya
	@GetMapping("/book/bookname/{bname}/authorname/{aname}")
	public ResponseEntity<String> GetBookData(@PathVariable ("bname") String bname,
			@PathVariable ("aname") String aname){
		String payload=bname + " By" + aname + " is out of stock";
		return new ResponseEntity<>(payload,HttpStatus.OK);
	}

}
