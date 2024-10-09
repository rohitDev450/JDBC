package com.jspider.multithreading.threads;

import com.jspider.multithreading.resource.MyResource1;

public class MyThread8 extends Thread{
	
	MyResource1 myResource1;
	
	
	public MyThread8(MyResource1 myResource1) {
		super();
		this.myResource1 = myResource1;
	}


	@Override
		public void run() {
		
			try {
				Thread.sleep(2000);
				myResource1.resource();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
}
