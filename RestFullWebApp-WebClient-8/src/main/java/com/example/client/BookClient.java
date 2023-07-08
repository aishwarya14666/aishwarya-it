package com.example.client;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.binding.Book;

@Service
public class BookClient {
	
	public void invokeBook() {
		
		Book book=new Book();
		book.setBookName("Angular");
		book.setBookPrice(450.00);
		
		String apiurl="";
	WebClient client=WebClient.create();
	String resp=client.post()
					.uri(apiurl)
					.bodyValue(book)
					.retrieve()
					.bodyToMono(String.class)
					.block();
	System.out.println(resp);
	}
	
	public void invokeGetBooksSync() {
		String apiurl="";
		WebClient client=WebClient.create();
		/*
		String resp=client.get()
				.uri(apiurl)
				.retrieve()
				.bodyToMono(String.class)
				.block();
System.out.println(resp);
*/

	Book[] responseData=client.get()
	.uri(apiurl)
	.retrieve()
	.bodyToMono(Book[].class)
	.block();
	for(Book b:responseData) {
		System.out.println(b);
	}
		
	}
	
	public void invokeGetBooksAsync() {
		String apiurl="";
		WebClient client=WebClient.create();
		
		client.get()
		.uri(apiurl)
		.retrieve()
		.bodyToMono(Book[].class)
		.subscribe(BookClient::respHandler);
		
		System.out.println(********************Request Sent*********************);
	}
	public static void respHandler(Book[] books) {
		for(Book b:books) {
			System.out.println(b);
		}
	}	

}
