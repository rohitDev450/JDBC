package com.jspider.FileHandling.Operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamReader {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("Demo.txt");
		if(file.exists()) {
			FileInputStream fileInputStream = new FileInputStream(file);
			System.out.println(fileInputStream.read());
			fileInputStream.close();
			System.out.println("Data is Fetch from File");
		}
		else {
			System.out.println("File is not Exist");
		}
	}

}
