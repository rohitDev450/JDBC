package com.jspider.FileHandling.Operations;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
	
	public static void main(String[] args) {
		
		File file = new File("Demo.txt");
		
		try {
			boolean status = file.createNewFile();
			if(status) {
				System.out.println("File is Created");
			}else {
				System.out.println("File is not Created");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

		
		
	}



