package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Book;
import com.example.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository repository;
	
	@Override
	public String UpsertBook(Book book) {
		Integer bookid=book.getBookId();
		repository.save(book);
		if(bookid==null) {
			return "Book Inserted";
		}
		else {
			return "Book Updated";
		}
	}
	
	@Override
	public List<Book> getAllBooks(){
		return repository.findAll();
	}
	
	@Override
	public String deleteBook(Integer bookId) {
		repository.deleteById(bookId);
		return "Book Deleted";
	}
	

}
