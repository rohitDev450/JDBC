package com.jspiders.desginpatterns.creational;

public class SingletoneEager {
       
	private static SingletoneEager singletoneEager = new SingletoneEager();
	
	   private SingletoneEager() {
		   System.out.println("Constructor is invoked");
	   }
	   
	   public static SingletoneEager getObject() {
		return singletoneEager;
		   
	   }
}
