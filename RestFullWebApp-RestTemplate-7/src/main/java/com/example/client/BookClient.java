package com.example.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.binding.Book;

@Service
public class BookClient {
	
	//post
	public void invokeBookTicket() {
		
		String apiUrl="http://localhost:8080/v2/api-docs/book";
		
		Book book=new Book();
		book.setBookName("Angular");
		book.setBookPrice(400.00);
		
		RestTemplate rt=new RestTemplate();
		
		ResponseEntity<String> postforEntity=rt.postForEntity(apiUrl,book,String.class);
		String body=postforEntity.getBody();
		System.out.println(body);
	}
	
	public void invokeGetBooksOld() {
		
		String apiUrl="http://localhost:8080/v2/api-docs/books";
		RestTemplate rt=new RestTemplate();
		ResponseEntity<String> getforEntity=rt.getForEntity(apiUrl,String.class);
		String body=getforEntity.getBody();
		System.out.println(body);
		
	}
	
	public void invokeGetBooksNew() {
		
		String apiUrl="http://localhost:8080/v2/api-docs/books";
		RestTemplate rt=new RestTemplate();
		ResponseEntity<Book[]> getforEntity=rt.getForEntity(apiUrl,Book[].class);
		Book[] body=getforEntity.getBody();
		for(Book book : body) {
		System.out.println(book);
		}
	}

}
