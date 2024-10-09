package com.jspider.multithreading.main;

import com.jspider.multithreading.threads.Husband;
import com.jspider.multithreading.threads.Wife;

public class Account {
	
	private static final com.jspider.multithreading.resource.Account Account = null;

	public static void main(String[] args) {
		
		
		//Account account =new Account();
		
		Husband husband = new Husband(Account);
		husband.start();
		
		Wife wife = new Wife(Account);
		wife.start();
	}

}
