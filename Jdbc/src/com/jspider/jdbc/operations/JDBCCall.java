package com.jspider.jdbc.operations;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCCall {
	
	private static Connection connection;
	private static CallableStatement callableStatement;
	private static ResultSet resultset;
	private static String query;
	
	public static void main(String[] args) {
		
		try {
			
			openConnection();
			query = "call p1()";
			callableStatement = connection.prepareCall(query);
			callableStatement.execute();
			resultset = callableStatement.getResultSet();
			while(resultset.next()) {
				System.out.println(resultset.getString(2));
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
		if(callableStatement !=null) {
			callableStatement.close();
		}
		if(connection !=null) {
			connection.close();
		}
	}

}
