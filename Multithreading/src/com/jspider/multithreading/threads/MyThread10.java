package com.jspider.multithreading.threads;

public class MyThread10 extends Thread{
	
	@SuppressWarnings("deprecation")
	@Override
	public void run() {
	  for(int i=0; i<=5; i++) {
		  System.out.println("Hello from My Thread 10 !!!");
		  if(i==3) {
			  stop();
		  }
	  }
	}

}
