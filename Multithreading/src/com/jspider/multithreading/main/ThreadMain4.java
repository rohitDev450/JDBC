package com.jspider.multithreading.main;

import com.jspider.multithreading.threads.MyThread5;

public class ThreadMain4 {
	
	public static void main(String[] args) {
		
		MyThread5 myThread5 = new MyThread5();
		myThread5.setName("MyThreadFive");
		myThread5.setPriority(8);
		myThread5.start();
	}

}
