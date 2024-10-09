package com.jspider.multithreading.threads;

import com.jspider.multithreading.resource.MyResource;

public class MyThread6 extends Thread{
	
	public MyThread6(MyResource myResource) {
	}
	
	@Override
	public void run() {
		synchronized (MyResource.resource1) {
			System.out.println("Lock is applied on Resource1 by MyThread6");
			
			synchronized (MyResource.resource2) {
				System.out.println("Lock is applied on Resource1 by MyThread7");
			
		}
	  }
	}	
}