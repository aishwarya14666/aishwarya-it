package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.Book;
import com.example.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository repository;
	
	//public BookServiceImpl(BookRepository repository) {
		//this.repository=repository;
	//}
	
	@Override
	public String UpsertBook(Book book) {
		//get the book id which has to be upserted
		Integer bookid=book.getBookId();
		//save the book
		repository.save(book);
		//check if book id is null or not
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
