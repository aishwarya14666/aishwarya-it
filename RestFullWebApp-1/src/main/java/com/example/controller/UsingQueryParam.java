package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsingQueryParam {
	
	//QueryParam Implementataion
	//Passing single parameter to RequestParam
	//URL: localhost:8080/good?name=Aishwarya
	@GetMapping("/good")
	public ResponseEntity<String> GetMorningMsg(@RequestParam ("name") String name){
		String payload=name +"Good Morning!";
		return new ResponseEntity<>(payload,HttpStatus.OK);
	}
	
	//passing multiple parameter to RequestParam
	//URL: localhost:8080/course?cname=JAVA&tname=Dinesh
	@GetMapping("/course")
	public ResponseEntity<String> GetCourse(@RequestParam ("cname") String cname,@RequestParam ("tname") String tname){
		String payload=cname +"By"+ tname+ "fees is 8000 INR";
		return new ResponseEntity<>(payload,HttpStatus.OK);
	}

}
