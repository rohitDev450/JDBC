package com.jspider.FileHandling.Operations;
import java.io.File;
import java.io.IOException;

public class CreateNewFile1 {
	
	public static void main(String[] args) {
		
		File file = new File("R:\\202307__\\Demo.txt");
		
		try {
			
			boolean status = file.createNewFile();
			if(status) {
				System.out.println("File is Created");
				
			}else {
				System.out.println("File is Already Existed");
			
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}

}
