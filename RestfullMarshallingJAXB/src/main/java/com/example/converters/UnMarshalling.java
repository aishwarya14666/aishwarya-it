package com.example.converters;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import com.example.binding.Person;

public class UnMarshalling {
	public static void main(String[] args) throws Exception {
		
		//which file to convert
		File xmlFile= new File("Person.xml");
		
		//create unmarshaller
		JAXBContext context=JAXBContext.newInstance(Person.class);
		//use unmarshaller
		Unmarshaller unmarshaller= context.createUnmarshaller();
		//convert xml file to object
		Object object=unmarshaller.unmarshal(xmlFile);
		//convert object to person object
		Person person=(Person) object;
		//print person object
	    System.out.println(person);
		
	}

}
