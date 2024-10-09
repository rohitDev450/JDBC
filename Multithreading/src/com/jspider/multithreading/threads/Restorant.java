package com.jspider.multithreading.threads;

import com.jspider.multithreading.resource.Food;

public class Restorant extends Thread {
	
	private Food food;
	
	
	public Restorant(Food food) {
		this.food = food;
	}


	@Override
		public void run() {
			food.prapare();
		
		}
}
