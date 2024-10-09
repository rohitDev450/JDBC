package com.jspider.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert2 {
	
	
	private static Connection connection;
	private static Statement statement;
	private static String query;
	
	
	public static void main(String[] args) {
	
		try {
			   openConnection();
			   statement = connection.createStatement();
			   query = "INSERT INTO user VALUES(3,'Mohit', 'Mohitaute111@gmail.com', 'Mohitpass@143')";
			   statement.execute(query);
			   System.out.println("Data Inserted!!!!");
			    
		}catch(SQLException e) {
			e.printStackTrace();
			
			
		} finally {
			try {
				closeConnection();
			}catch(SQLException e2) {
				e2.printStackTrace();
			}
		}
	}
	
	private static void openConnection() throws SQLException {
		
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4?user=root&&password=root");
		
		
	}
	
	private static void closeConnection() throws SQLException {
		
		 if(statement !=null) {
			 statement.close();
		 }
		 
		 if(connection !=null) {
			 connection.close();
		 }
		
	}

}
