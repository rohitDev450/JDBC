package com.jspider.multithreading.main;

import com.jspider.multithreading.threads.MyThread3;
import com.jspider.multithreading.threads.MyThread4;

public class ThreadMain3 {
	
	public static <Mythread4> void main(String[] args) {
		
		MyThread3 myThread3 = new MyThread3();
		myThread3.start();
		
		MyThread4 myThread4 = new MyThread4();
		myThread4.start();
	}

}
