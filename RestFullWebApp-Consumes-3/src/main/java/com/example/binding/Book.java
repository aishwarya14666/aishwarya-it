package com.example.binding;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {
	
	private Integer Id;
	private String Name;
	private Double Price;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Book [Id=" + Id + ", Name=" + Name + ", Price=" + Price + "]";
	}
	

}
