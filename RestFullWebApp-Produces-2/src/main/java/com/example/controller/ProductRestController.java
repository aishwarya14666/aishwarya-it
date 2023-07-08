package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.binding.Product;

@RestController
public class ProductRestController {
	
	//URL : localhost:8080/product
	//Enter key=Accept and value=application/xml or application/json in header in postman
	@GetMapping(value="/product",produces= {"application/xml","application/json"})
	public ResponseEntity<Product> GetProducts(){
		
		Product productobj=new Product();
		productobj.setPid(101);
		productobj.setPname("Mouse");
		productobj.setPprice(200.00);
		
		return new ResponseEntity<>(productobj,HttpStatus.OK);
	}
		
	//URL : localhost:8080/products
		@GetMapping("/products")
		public ResponseEntity<List<Product>> GetAllProducts(){
			
			Product p1=new Product(102,"CPU",500.00);
			Product p2=new Product(103,"Keyboard",200.00);
			Product p3=new Product(104,"CD",100.00);
			
			List<Product> b=Arrays.asList(p1,p2,p3);
			return new ResponseEntity<>(b,HttpStatus.OK);
		}
		
	}

