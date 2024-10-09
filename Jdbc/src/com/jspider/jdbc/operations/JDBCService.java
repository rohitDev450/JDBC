package com.jspider.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCService {

	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet;
	private static String query;
	

	public static void singUp(Scanner scanner) throws SQLException {
		
		System.out.println("---------------------- SingUp Here ---------------------------");
		System.out.println("Enter User Id ");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter User Name");
		String name = scanner.nextLine();
		System.out.println("Enter User Email ");
		String email = scanner.nextLine();
		System.out.println("Enter User Password");
		String password = scanner.nextLine();
		
		
		try {
			openConnection();
			query = "INSERT INTO user VALUES(?,?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, email);
			preparedStatement.setString(4, password);
			int res =preparedStatement.executeUpdate();
			if(res == 1) {
				System.out.println(" SingUp Sucessfully ");
			}else {
				System.out.println("Error Occur!!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeConnection();
		}
	
	}
	
	
	public static void login(Scanner scanner) {
		
		System.out.println("-------------------- Login Here --------------------");
		scanner.nextLine();
		System.out.println("Enter User Email ");
		String email = scanner.nextLine();
		
		System.out.println("Enter User Password");
		String password = scanner.nextLine();
		
		try {
			
			openConnection();
			query = "SELECT * FROM user WHERE email = ? AND password = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				System.out.println("Logged in");
				System.out.println("Welcome To Application");
			}else {
				System.out.println("Inavlid email and password");
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
		
		if(preparedStatement !=null) {
			preparedStatement.close();
		}
		if(connection !=null) {
			connection.close();
		}
	}
}
