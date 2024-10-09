package com.jspiders.desginpatterns.main;

import com.jspiders.desginpatterns.creational.SingletoneLazy;

public class SingletoneLazyMain {
      public static void main(String[] args) {
		
    	  SingletoneLazy singletoneLazy1 = SingletoneLazy.getObject();
    	  System.out.println(singletoneLazy1);
    	  
    	  SingletoneLazy singletoneLazy2 = SingletoneLazy.getObject();
    	  System.out.println(singletoneLazy2);
	}
}
