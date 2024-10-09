package com.jspiders.desginpatterns.main;

import com.jspiders.desginpatterns.structural.Adapter;

public class AdapterMain {
	
	public static void main(String[] args) {
		
		Adapter adapter = new Adapter();
		adapter.setName("Narend Modi");
		adapter.mensDay();
		adapter.setName("Mamta banrji");
		adapter.womensDay();
	}

}
