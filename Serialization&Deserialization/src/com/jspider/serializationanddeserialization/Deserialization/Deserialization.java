package com.jspider.serializationanddeserialization.Deserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.jspider.serializationanddeserialization.object.User;

public class Deserialization {
	
	 public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		 File file = new File("Demo.txt");
		 FileInputStream fileInputStream = new FileInputStream(file);
		 ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		 User user = (User) objectInputStream.readObject();
		 System.out.println(user);
		 System.out.println("Object is desrialization");
		 objectInputStream.close();
		 fileInputStream.close();
		 
		 
	}

}
