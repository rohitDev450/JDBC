package com.jspiders.desginpatterns.creational;

public class SingletoneLazy {
	
	private static SingletoneLazy singletoneLazy;
	
	private SingletoneLazy() {
		System.out.println("Constructor is invoked ");
	}
	
	public static SingletoneLazy getObject() {
		   if(singletoneLazy == null) {
			   singletoneLazy = new SingletoneLazy();
		   }
		   return singletoneLazy;
		
	}
	
	

}
