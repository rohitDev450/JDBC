package com.jspider.FileHandling.Operations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWrite {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("Demo.txt");
		if(file.exists()) {
			
			FileOutputStream fileOutPutStream = new FileOutputStream(file);
			fileOutPutStream.write(1350);
			System.out.println("Data is writen to file");
			fileOutPutStream.close();
			
		}
		else {
			boolean statuts = file.createNewFile();
			if(statuts) {
				System.out.println("File is Created");
				FileOutputStream fileOutPutStream = new FileOutputStream(file);
				fileOutPutStream.write(1350);
				System.out.println("Data is writen to file");
				fileOutPutStream.close();
			}
			else {
				System.out.println("File is Not Created");
			}
		}
	}

}
