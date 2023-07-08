package com.example.binding;


public class Ticket {
	
	private Integer ticketid;
	private String bookingStatus;
	private Double ticketPrice;
	public Integer getTicketid() {
		return ticketid;
	}
	public void setTicketid(Integer ticketid2) {
		this.ticketid = ticketid2;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public Double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public Ticket(Integer ticketid, String bookingStatus, Double ticketPrice) {
		super();
		this.ticketid = ticketid;
		this.bookingStatus = bookingStatus;
		this.ticketPrice = ticketPrice;
	}
	public Ticket() {
		super();
	}
	@Override
	public String toString() {
		return "Ticket [ticketid=" + ticketid + ", bookingStatus=" + bookingStatus + ", ticketPrice=" + ticketPrice
				+ "]";
	}
	
	

}
