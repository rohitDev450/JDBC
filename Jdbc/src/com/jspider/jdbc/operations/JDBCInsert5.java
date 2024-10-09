package com.jspider.jdbc.operations;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert5 {
	
	private static Connection connection;
	private static Statement statement;
	private static String query;
	
	public static void main(String[] args) {
		 
		try {
			openConnection();
			statement = connection.createStatement();
			query = "INSERT INTO student VALUE(6, 'Rohit', 'rohit@gmail.com', 22)";
			statement.execute(query);
			System.out.println("Data Inserted!!!!!");
			
			
			
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
		if(statement !=null) {
			statement.close();
		}
		if(connection !=null) {
			connection.close();
		}
	}

}
