
package com.jspiders.desginpatterns.main;

import java.util.Scanner;

import com.jspiders.desginpatterns.creational.Beverage;
import com.jspiders.desginpatterns.creational.GingerTea;
import com.jspiders.desginpatterns.creational.GreenTea;
import com.jspiders.desginpatterns.creational.LemonTea;
import com.jspiders.desginpatterns.creational.MasalaTea;

public class FactoryMain {
	public static void main(String[] args) {
       try {
		
    	   Factory().order();
		
       }catch(NullPointerException e){
    	   System.out.println("No Tea Ordered");
    	   e.printStackTrace();
       }
	}

	private static Beverage Factory() {

		Beverage beverage = null;
		System.out.println("Enter 1 to order masala tea\n" + "Enter 2 to order green tea\n"
				+ "Enter 3 to order lemon tea\n" + " Enter 4 to order gimger tea");
		System.out.println("Enter your choice : ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.close();

		switch (choice) {

		case 1:
			beverage = new MasalaTea();
			break;

		case 2:
			beverage = new GreenTea();
			break;

		case 3:
			beverage = new LemonTea();
			break;
		case 4:
			beverage = new GingerTea();
			break;

		default:
			System.out.println("Invalid choice");
            
		}
		return beverage;
	}
}
