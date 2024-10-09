package com.jspider.jdbc.operations;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert {
             
	public static void main(String[] args) throws SQLException {
		
		//Load and Register the Driver
		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		
		//Open the connection 
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4?user=root&&password=root");
		
		//Create Statement
		Statement statement = connection.createStatement();
		
		
		
		//Execute Statement
		statement.execute("INSERT INTO user VALUES(1,'Ramesh', 'ramesh@143', 'ramesh143')");
		
		//Process the result 
		System.out.println("Data Inserted!!!!");
		
		//Close the connection
		statement.close();
		connection.close();
		
		//DeRegister the Driver 
		DriverManager.deregisterDriver(driver);
	}
}
