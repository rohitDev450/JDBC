package com.jspider.jdbc.operations;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCInsert4 {
	
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static String query;
	
	public static void main(String[] args) {
		
		    Scanner scanner = new Scanner(System.in);
		    System.err.println("Enter Student id ");
		    int id = scanner.nextInt();
		    scanner.nextLine();
		    System.out.println("Enter Student Name ");
		    String name = scanner.nextLine();
		    System.out.println("Enter Student Email ");
		    String email = scanner.nextLine();
		    System.out.println("Enter student Age ");
		    int age = scanner.nextInt();
		    scanner.close();
		
		
		try {
			openConnection();
			query = "INSERT INTO student VALUE(?,?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, email);
			preparedStatement.setInt(4, age);
			 int res = preparedStatement.executeUpdate();
			 System.out.println(res +" row(s) afected ");
			
			
		} catch (Exception e) {
		     e.printStackTrace();
		}finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public static void openConnection() throws SQLException, IOException {
		
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4?","root","root");
	}
	
	public static void closeConnection() throws SQLException {
		if(preparedStatement !=null) {
			preparedStatement.close();
		}
		if(connection !=null) {
			connection.close();
		}
	}

}
