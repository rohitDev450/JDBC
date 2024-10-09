package com.jspider.multithreading.main;

import com.jspider.multithreading.resource.MyResource;
import com.jspider.multithreading.threads.MyThread6;
import com.jspider.multithreading.threads.MyThread7;

public class ThreadMain5 {
	
	public static void main(String[] args) {
		//Program of DeadLock
		MyResource myResource = new MyResource();
		
		MyThread6 myThread6 = new MyThread6(myResource);
		MyThread7 myThread7 = new MyThread7(myResource);
		
		myThread6.start();
		myThread7.start();
		
		
	}

}
