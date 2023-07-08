package com.example.binding;

public class Passenger {
	
	private String Name;
	private String Email;
	private String From;
	private String To;
	private String journeyDate;
	private String trainNum;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getFrom() {
		return From;
	}
	public void setFrom(String from) {
		From = from;
	}
	public String getTo() {
		return To;
	}
	public void setTo(String to) {
		To = to;
	}
	public String getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}
	public String getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}
	@Override
	public String toString() {
		return "Passenger [Name=" + Name + ", Email=" + Email + ", From=" + From + ", To=" + To + ", journeyDate="
				+ journeyDate + ", trainNum=" + trainNum + "]";
	}
	public Passenger(String name, String email, String from, String to, String journeyDate, String trainNum) {
		super();
		Name = name;
		Email = email;
		From = from;
		To = to;
		this.journeyDate = journeyDate;
		this.trainNum = trainNum;
	}
	public Passenger() {
		super();
	}
	

}
