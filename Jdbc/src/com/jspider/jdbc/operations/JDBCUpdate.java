package com.jspider.jdbc.operations;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUpdate {
	
	private static Connection connection;
	private static Statement statement;
	private static String query;

	public static void main(String[] args) {
		
		try {
			  openConnection();
			  statement = connection.createStatement();
			  query ="UPDATE student SET email = 'ramesh543@gmail.com' Where name = 'Ramesh' ";
			  statement.execute(query);
			  System.out.println("Email is Updated!!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void openConnection() throws IOException, SQLException {
		
		File file = new File("R://db_info.txt");
		FileReader fileReader = new FileReader(file);
		Properties properties = new Properties();
		properties.load(fileReader);
		connection = DriverManager.getConnection(properties.getProperty("url"),properties);
		
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
