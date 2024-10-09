package com.jspider.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCSelect4 {
	
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static String query;
	private static ResultSet resultSet;
	
	public static void main(String[] args) throws SQLException {
                   
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter user ID ");
		int id = scanner.nextInt();
		scanner.close();
		
		try {
			openConnection();
			query = "SELECT * FROM user WHERE id= ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			resultSet =  preparedStatement.executeQuery();
			if(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(4));
			}else {
				System.out.println("User not found!!!!");
			}
			
			
			
		} catch (Exception e) {
	         e.printStackTrace();
		}finally {
			closeConnection();
		}
	}
	
	public static void openConnection() throws SQLException {
		
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4", "root", "root");
	}
	
	public static void closeConnection() throws SQLException {
		
		if(preparedStatement !=null) {
			preparedStatement.close();
		}
		if(resultSet !=null) {
			resultSet.close();
		}
		if(connection !=null) {
			connection.close();
		}
	}

}
