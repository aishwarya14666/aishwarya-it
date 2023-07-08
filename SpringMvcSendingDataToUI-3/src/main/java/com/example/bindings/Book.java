package com.example.bindings;

public class Book {

	public Book(Integer BookId, String BookName, double BookPrice){
		
		bookId=BookId;
		bookName=BookName;
		bookPrice=BookPrice;
		
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
    public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	private  Integer bookId;
	private String bookName;
    private double bookPrice;

}