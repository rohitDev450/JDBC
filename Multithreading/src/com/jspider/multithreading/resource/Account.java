package com.jspider.multithreading.resource;

public class Account {
	
	double accountBalance;
	
	public void deposite(double amount) {
		System.out.println("Amount of rupees"+amount+" has been Created");
	   accountBalance = accountBalance + amount;
		System.out.println("Current account balance is "+accountBalance);
	}
	
	public void Withdraw(double amount) {
		System.out.println("Amount of rupees "+amount+" has been debited");
		 accountBalance = accountBalance + amount;
		System.out.println("Current account balance is "+accountBalance);
	}

}
