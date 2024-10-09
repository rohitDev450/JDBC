package com.jspiders.desginpatterns.creational;

public class contactBuilder {
	
	private String firstName;
	private String lastName;
	private String dob;
	private long mobile;
	private long work;
	private long home;
	private int landline;
	private String email;
	private String address;
	
	
	
	
	public contactBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	public contactBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public contactBuilder setDob(String dob) {
		this.dob = dob;
		return this;
	}
	public contactBuilder setMobile(long mobile) {
		this.mobile = mobile;
		return this;
	}
	public contactBuilder setWork(long work) {
		this.work = work;
		return this;
	}
	public contactBuilder setHome(long home) {
		this.home = home;
		return this;
	}
	public contactBuilder setLandline(int landline) {
		this.landline = landline;
		return this;
	}
	public contactBuilder setEmail(String email) {
		this.email = email;
		return this;
	}
	public contactBuilder setAddress(String address) {
		this.address = address;
		return this;
	}
	
	public conatct buildContact() {
		return new conatct(firstName, lastName, dob, mobile, work, home, landline, email, address);
	}
}
