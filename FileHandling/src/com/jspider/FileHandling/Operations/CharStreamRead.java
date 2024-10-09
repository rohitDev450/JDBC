package com.jspider.FileHandling.Operations;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamRead {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("Demo.txt");
		if(file.exists()) {
			FileReader fileReader = new FileReader(file);
			System.out.println(fileReader.read());
			fileReader.close();
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
			System.out.println("Data is Fetch From the File");
		}
		else {
			System.out.println("File is Not Exist");
		}
	}

}
