package com.jspider.multithreading.threads;

import com.jspider.multithreading.resource.Account;

public class Husband extends Thread {
	
	private Account account;

	public Husband(Account account) {
		this.account = account;
	}
	
	
	@Override
	public void run() {
		account.deposite(10000);
		account.Withdraw(2000);
	}
	
	
	

}
