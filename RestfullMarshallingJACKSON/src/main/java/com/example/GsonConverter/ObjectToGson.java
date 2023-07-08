package com.example.GsonConverter;

import com.example.binding.Author;
import com.example.binding.Book;
import com.google.gson.Gson;

public class ObjectToGson {
	
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
		
		Gson gson=new Gson();
		String json=gson.toJson(book);
		System.out.println(json);
}
}
