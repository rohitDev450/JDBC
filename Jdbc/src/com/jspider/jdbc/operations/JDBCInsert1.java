package com.jspider.jdbc.operations;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert1 {
	
	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
	private static String query;
	
	
	public static void main(String[] args) {
	
		try {
			   openConnection();
			   statement = connection.createStatement();
			   query = "INSERT INTO user VALUES(2,'Rohit', 'rohitaute111@gmail.com', 'Rohitpass@143')";
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
		driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4?user=root&&password=root");
		
		
	}
	
	private static void closeConnection() throws SQLException {
		
		 if(statement !=null) {
			 statement.close();
		 }
		 
		 if(connection !=null) {
			 connection.close();
		 }
		 DriverManager.deregisterDriver(driver);
	}

}
