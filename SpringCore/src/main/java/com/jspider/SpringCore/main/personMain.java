package com.jspider.SpringCore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.SpringCore.entity.Person;

public class personMain {
	
	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("person_aadhar.xml");
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person);
		((ClassPathXmlApplicationContext) applicationContext).close();
		
       
		
	}

}
