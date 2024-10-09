package com.jspider.multithreading.main;

import com.jspider.multithreading.resource.Food;
import com.jspider.multithreading.threads.Customer;
import com.jspider.multithreading.threads.Restorant;

public class ThreadMain9 {
	public static void main(String[] args) {
		Food food = new Food();
		Customer customer = new Customer(food);
		Restorant restorant = new Restorant(food);
		
		customer.start();
		restorant.start();
	}
}
