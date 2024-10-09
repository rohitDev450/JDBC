package com.jspider.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCInsert6 {
	
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static String Query;
	
	public static void main(String[] args) {
		
		try {
			
			openConnection();
			Query = "INSERT INTO user VALUES(?,?,?,?)";
			preparedStatement = connection.prepareStatement(Query);
			Scanner scanner = new Scanner(System.in);
			System.out.println("How Many records you want to insert?");
			int count = scanner.nextInt();
			for(int i=1; i<= count; i++) {
				System.out.println("Enter User Id ");
				int id = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter User Name");
				String name = scanner.nextLine();
				System.out.println("Enter User Email ");
				String email = scanner.nextLine();
				System.out.println("Enter User Password");
				String password = scanner.nextLine();
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, name);
				preparedStatement.setString(3, email);
				preparedStatement.setString(4, password);
				preparedStatement.addBatch();
			}
			scanner.close();
			int[] res = preparedStatement.executeBatch();
			System.out.println(res.length +" row(s) affected");
			
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
	
	public static void openConnection() throws SQLException {
		
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4", "root", "root");
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
