package com.example.binding;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {
	
	private Integer Id;
	private String Name;
	private Integer Age;
	private Long Pno;
	private Address address;
	
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
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		Age = age;
	}
	public Long getPno() {
		return Pno;
	}
	public void setPno(Long pno) {
		Pno = pno;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [Id=" + Id + ", Name=" + Name + ", Age=" + Age + ", Pno=" + Pno + ", address=" + address + "]";
	}

}
