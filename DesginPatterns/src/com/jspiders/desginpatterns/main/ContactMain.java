package com.jspiders.desginpatterns.main;

import com.jspiders.desginpatterns.creational.conatct;
import com.jspiders.desginpatterns.creational.contactBuilder;

public class ContactMain {
	
	public static void main(String[] args) {
		
		conatct contact = new contactBuilder().setFirstName("Rohit").setLastName("Aute").setMobile(247986479l).buildContact();
		System.out.println(contact);
	}

}
