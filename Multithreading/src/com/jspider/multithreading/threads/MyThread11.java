package com.jspider.multithreading.threads;

public class MyThread11 extends Thread{

	@Override
	public void run() {
		String message = "Java Is Programming Language";
		char [] charArray = message.toCharArray() ;
		for(int i=0;i<charArray.length;i++) {
			System.out.print(charArray[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
