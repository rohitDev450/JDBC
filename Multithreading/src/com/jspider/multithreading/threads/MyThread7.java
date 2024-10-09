package com.jspider.multithreading.threads;

import com.jspider.multithreading.resource.MyResource;

public class MyThread7 implements Runnable {
	
	public MyThread7(MyResource myResource) {
	}
	
	public void run() {
		synchronized (MyResource.resource2) {
			System.out.println("Lock is applied on Resource1 by MyThread6");
			
			synchronized (MyResource.resource1) {
				System.out.println("Lock is applied on Resource1 by MyThread7");
			
		}
	}
  }

	public void start() {
		// TODO Auto-generated method stub
		
	}
}
