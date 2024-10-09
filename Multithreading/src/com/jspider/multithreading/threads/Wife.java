package com.jspider.multithreading.threads;

import com.jspider.multithreading.resource.Account;

public class Wife extends Thread {
	
			private Account account;
		
			
		public Wife(Account account) {
				super();
				this.account = account;
			}


		@Override
		public void run() {
			account.deposite(2000);
			account.Withdraw(5000);
		}
				

	}

