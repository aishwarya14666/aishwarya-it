package com.example.bindings;


public class Book {
	
	public Integer BookId;
	public String BookName;
	public Double BookPrice;
	
	public Integer getBookId() {
		return BookId;
	}
	public void setBookId(Integer bookId) {
		BookId = bookId;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public Double getBookPrice() {
		return BookPrice;
	}
	public void setBookPrice(Double bookPrice) {
		BookPrice = bookPrice;
	}
	
	public Book(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	
	public Book(int i, String string, double d) {
		// TODO Auto-generated constructor stub
		BookId=i;
		BookName=string;
		BookPrice=d;
	}
	

	
}
