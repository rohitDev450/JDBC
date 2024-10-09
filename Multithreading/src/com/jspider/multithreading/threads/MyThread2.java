package com.jspider.multithreading.threads;

public class MyThread2 implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Hello From My Thread2");
		System.out.println("This Thread using Runnable interface");
	}
}
