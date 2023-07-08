package com.example.binding;

public class Address {
	
	private String City;
	private String State;
	private String Country;
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	@Override
	public String toString() {
		return "Address [City=" + City + ", State=" + State + ", Country=" + Country + "]";
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}

}
