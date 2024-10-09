package com.jspider.FileHandling.Operations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamWrite {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("Demo.txt");
		
		if(file.exists()) {
			
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Java is Programming Langauage Which is using to built a software or Application.");
			System.out.println("File Written Sucessfully");
			fileWriter.close();
		}
		else {
			boolean status = file.createNewFile();
			if(status) {
				System.out.println("File is Cretaed");
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write("Java is Programming Langauage Which is using to built a software or Application.");
				System.out.println("File Written Sucessfully");
				fileWriter.close();
			}
			else {
				System.out.println("File is Not Created");
			}
		}
	}

}
