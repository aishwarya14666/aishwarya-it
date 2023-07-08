package com.example.service;

import java.util.List;

import com.example.entity.Book;

public interface BookService {
		
		public String UpsertBook(Book book);
		public List<Book> getAllBooks();
		public String deleteBook(Integer bookId);

	}

