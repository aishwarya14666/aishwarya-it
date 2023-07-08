package com.example.converters;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.example.binding.Address;
import com.example.binding.Person;

public class Marshalling {
	public static void main(String[] args) throws Exception {
	
	Address addr=new Address();
	addr.setCity("Belgaum");
	addr.setState("Karnataka");
	addr.setCountry("India");
	
	Person person=new Person();
	person.setId(101);
	person.setName("Aishwarya");
	person.setAge(25);
	person.setPno(3656554l);
	person.setAddress(addr);
	
	JAXBContext instance=JAXBContext.newInstance(Person.class);
	Marshaller marshaller=instance.createMarshaller();
	marshaller.marshal(person, new File("Person.xml"));
    System.out.println("Marshalling Completed....");
	

}
}
