package com.jspiders.desginpatterns.creational;

public class conatct {
	
	private String firstName;
	private String lastName;
	private String dob;
	private long mobile;
	private long work;
	private long home;
	private int landline;
	private String email;
	private String address;
	
	
	
	public conatct(String firstName, String lastName, String dob, long mobile, long work, long home, int landline,
			String email, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.mobile = mobile;
		this.work = work;
		this.home = home;
		this.landline = landline;
		this.email = email;
		this.address = address;
	}



	@Override
	public String toString() {
		return "conatct [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", mobile=" + mobile
				+ ", work=" + work + ", home=" + home + ", landline=" + landline + ", email=" + email + ", address="
				+ address + "]";
	}
	
	
	

}
