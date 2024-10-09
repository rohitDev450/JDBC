package com.jspiders.desginpatterns.main;

import com.jspiders.desginpatterns.creational.SingletoneEager;

public class SingletoneEgerMain {
	
	public static void main(String[] args) {
		
		SingletoneEager singletoneEager1 = SingletoneEager.getObject();
		System.out.println(singletoneEager1);
		
		SingletoneEager singletoneEager2 = SingletoneEager.getObject();
		System.out.println(singletoneEager2);
	}

}
