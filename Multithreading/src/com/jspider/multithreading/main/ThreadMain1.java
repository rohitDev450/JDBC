package com.jspider.multithreading.main;

import com.jspider.multithreading.threads.MyThread1;

public class ThreadMain1 {

	 public static void main(String[] args) {
		
		 MyThread1 myThread1 = new MyThread1();
		 myThread1.start();
	}
}
