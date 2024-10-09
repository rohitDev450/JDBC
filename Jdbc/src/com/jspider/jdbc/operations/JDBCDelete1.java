package com.jspider.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDelete1 {

	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultset;
	private static String query;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter user ID ");
		int id = scanner.nextInt();
		scanner.close();
		

		try {
			
			openConnection();
			query = "DELETE FROM user WHERE id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
		    int res =  preparedStatement.executeUpdate();
		    if(res == 1) {
		    
		    	System.out.println("USER IS DELETED");
		    } else {
		    	System.out.println("User not found!!!!");
		    }
		    
			

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

		if (preparedStatement != null) {
			preparedStatement.close();
		}
		if (resultset != null) {
			resultset.close();
		}
		if (connection != null) {
			connection.close();
		}
	}
}
