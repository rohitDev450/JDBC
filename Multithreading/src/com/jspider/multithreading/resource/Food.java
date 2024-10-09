package com.jspider.multithreading.resource;

public class Food {
	
	private boolean available;
	
	public synchronized void order() {
		System.out.println("Order is Received");
		if (available) {
			System.out.println("Order Delivered..");
		}else {
			System.out.println("Food Is Not Available ");
			System.out.println("Wait for some time");
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (available) {
					System.out.println("Your Order is done plaease take it...");
				}
		}
	}
	public synchronized void prapare(){
			System.out.println("Your Order geting prapare...");
			available = true;
			notify();
			
	}
}
