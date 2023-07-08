package com.example.GsonConverter;

import java.io.File;
import java.io.FileReader;

import com.example.binding.Book;
import com.google.gson.Gson;

public class GsonToObject {
	
	public static void main(String[] args) throws Exception{
		
	
	File GsonFile=new File("book.json");
	
	Gson gson=new Gson();
	Book book=gson.fromJson(new FileReader(new File("book.json")),Book.class);
	System.out.println(book);
	
	}
}
