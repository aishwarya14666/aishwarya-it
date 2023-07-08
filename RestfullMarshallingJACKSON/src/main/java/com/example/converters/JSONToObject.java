package com.example.converters;

import java.io.File;

import com.example.binding.Book;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONToObject {
	
	public static void main(String[] args) throws Exception {
		
		File Jsonfile=new File("book.json");
		
		ObjectMapper mapper=new ObjectMapper();
		Book book=mapper.readValue(Jsonfile, Book.class);
		System.out.println(book);
	}

}
