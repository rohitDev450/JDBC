package com.jspider.dbcardekhocasestudy.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.jspider.dbcardekhocasestudy.operation.CarOperation;

public class CarMain {
	
	
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet;
	private static String query;
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		
		
		boolean flag = true;
		while (flag) {
			System.out.println("============== Login/SingUp Page ==================\n"
					+ "1.Singup\n2.Login\n3.Exit");
			int choice = scanner.nextInt();
			switch (choice) {

			case 1:
				singUp();
				break;
			case 2:
			    login();
				break;

			case 3:
				flag = false;
				System.out.println("=================== Thank you for Visiting!!!=============");
				break;

			default:
				System.out.println("Invalid Option!!!!");

			}
			
		}
		//scanner.close();
	}	
	
         public static void singUp() throws SQLException {
			
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
     	
     	
     	public static void login() {
    		
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
  
    				CarOperation carOp = new CarOperation();
    				boolean flag1 = true;
    				
    				while (flag1) {
    					System.out.println("========================= Welcome TO Our Car Showroom =======================\n"
    				+"1.View All Cars\n" + "2.Search Cars\n" + "3.Add Car\n" + "4.Remove Car\n"
    							+ "5.Edit car \n" + "6.Exit\n");
    					scanner = new Scanner(System.in);
    					int choice = scanner.nextInt();

    					switch (choice) {
    					case 1: {
    						System.out.println("View All Cars");
    						carOp.ViewAllCars();
    						break;
    					}
    					case 2: {
    						System.out.println(
    								"=============== Serach Your Car ================" 
    						+"1. Search By Id\n" + "2. Search By Name\n" + "3. Search By Model\n" + "4. Search By Price\n"
    										+ "5. Search By Color\n" + "6. Search By Brand\n" + "7. Search By FuleType\n");
    						int choice1 = scanner.nextInt();
    						switch (choice1) {
    						case 1: {
    							System.out.println("===Search By Id===");
    							carOp.SearchCarById();
    							break;
    						}
    						case 2: {
    							System.out.println("===Search By Name===");
    							carOp.SearchCarByName();
    							break;
    						}
    						case 3: {
    							System.out.println("===Search By Model===");
    							carOp.SearchByModel();
    							break;
    						}
    						case 4: {
    							System.out.println("===Search By Price===");
    							carOp.SearchByPrice();
    							break;   							
    						}
    						case 5: {
    							System.out.println("===Search By Color===");
    							carOp.SearchByColor();
    							break;
    						}
    						case 6: {
    							System.out.println("===Search By Brand");
    							carOp.SearchByBrand();
    							break;
    						}
    						case 7: {
    							System.out.println("===Search By FuleType");
    							carOp.SearchByFuleType();
    							break;
    						}
    						default: {
    							System.out.println("Invalid Input");
    						}
    						}
    						break;
    					}
    					case 3: {
    						System.out.println("-------- Add New Car --------");
    						carOp.CarAdd();
    						break;
    					}
    					case 4: {
    						System.out.println("-------- Remove Car ---------");
    						try {
    							carOp.removeCar();
    						} catch (SQLException e) {
    							// TODO Auto-generated catch block
    							e.printStackTrace();
    						}
    						break;
    					}
    					case 5: {
    						System.out.println("-------- Edit Car ------------");
    						carOp.editCar();
    						break;
    					}
    					case 6: {
    						System.out.println("============== Thank You! =================");
    						flag1 = false;
    						break;
    					}
    					default: {
    						System.out.println("Invalid Input!!!!!!!!!");
    					}

    					}
    				} 
				
    			}else {
    				System.out.println("Inavlid email and password");
    			}
    			
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
     	
}
    	
		

