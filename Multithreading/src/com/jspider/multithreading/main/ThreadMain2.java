package com.jspider.multithreading.main;

import com.jspider.multithreading.threads.MyThread2;

public class ThreadMain2 {
	
	public static void main(String[] args) {
		
		MyThread2 myThread2 = new MyThread2();
		Thread thread = new Thread(myThread2);
		thread.start();
	}

}
