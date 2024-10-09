package com.jspider.multithreading.main;

import com.jspider.multithreading.resource.MyResource1;
import com.jspider.multithreading.threads.MyThread8;
import com.jspider.multithreading.threads.MyThread9;

public class ThreadMain6 {
	
	public static void main(String[] args) {
		MyResource1 myResource1 =  new MyResource1();
		MyThread8 myThread8  = new MyThread8(myResource1);
        MyThread9 mythread9 = new MyThread9(myResource1);
        
        myThread8.start();
        mythread9.start();
        
        myThread8.setName("MyThread8");
        mythread9.setName("MyThread9");
	}

}
