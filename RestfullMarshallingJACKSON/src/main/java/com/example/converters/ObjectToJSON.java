package com.example.converters;

import java.io.File;

import com.example.binding.Author;
import com.example.binding.Book;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJSON {
	
	public static void main(String[] args) throws Exception {
		
		Author author =new Author();
		author.setAuthorName("Aishwarya");
		author.setAuthorEmail("a@23");
		author.setAuthorPno(546534132l);
		
		Book book=new Book();
		book.setId(101);
		book.setName("Java");
		book.setPrice(500);
		book.setAuthor(author);
		
		ObjectMapper mapper= new ObjectMapper();
		mapper.writeValue(new File("book.json"), book);
		System.out.println("Conversion Completed....");
	}

}
