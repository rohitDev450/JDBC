package com.jspider.FileHandling.Operations;

import java.io.File;

public class DeleteFile {
	
	public static void main(String[] args) {
		
		File file = new File("Demo.txt");
	    
		if(file.exists()) {
			boolean status = file.delete();
			if(status) {
				file.delete();
				System.out.println("File is Deleted");
			}else {
				System.out.println("File is Not Deleted");
			}
		}else {
			System.out.println("File is Not Exist");
		}
		
	}

}
