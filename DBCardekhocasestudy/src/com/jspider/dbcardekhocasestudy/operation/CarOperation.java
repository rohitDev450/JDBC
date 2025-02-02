package com.jspider.dbcardekhocasestudy.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.jspider.dbcardekhocasestudy.entity.Car;

public class CarOperation {

	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static String query;
	private static ResultSet resultSet;

	Scanner scanner = new Scanner(System.in);
	ArrayList<Car> cars = new ArrayList<Car>();
	Car car = new Car();

	public void CarAdd() {
		@SuppressWarnings("unused")
		Car car = new Car();
		System.out.println("Enter Car Id");
		int carid = scanner.nextInt();
		System.out.println("Enter Car Name");
		String carname = scanner.next();
		scanner.nextLine();
		System.out.println("Enter Car Model");
		String carmodel = scanner.next();
		scanner.nextLine();
		System.out.println("Enter Car Price");
		double carprice = scanner.nextDouble();
		System.out.println("Enter Car Color");
		String carcolor = scanner.next();
		System.out.println("Enter Car Brand");
		String carbrand = scanner.next();
		System.out.println("Enter Car fuelType");
		String fuletype = scanner.next();

		try {

			openConnection();
			query = "INSERT INTO car VALUE(?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, carid);
			preparedStatement.setString(2, carname);
			preparedStatement.setString(3, carmodel);
			preparedStatement.setDouble(4, carprice);
			preparedStatement.setString(5, carbrand);
			preparedStatement.setString(6, carcolor);
			preparedStatement.setString(7, fuletype);
			int res = preparedStatement.executeUpdate();
			if (res == 1) {
				System.out.println("Car Added Sucessfully");
			} else {
				System.out.println("Car not added!!!!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void ViewAllCars() {

		try {

			openConnection();
			query = "SELECT * FROM car";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
     		System.out.println("Current Cars:");
            System.out.println("+----------------+-----------------+---------------+----------------------+------------------+");
            System.out.println("| ID | Name           | Model   | Price      | Color        | Brand        | Fuletype        |");
            System.out.println("+----------------+-----------------+---------------+----------------------+------------------+");
            
          
        
			while (resultSet.next()) {
				System.out.print("|  "+resultSet.getInt(1)+" | ");
				System.out.print(resultSet.getString(2)+"         ");
				System.out.print(resultSet.getString(3)+"   ");
				System.out.print("  "+resultSet.getDouble(4)+"   ");
				System.out.print("     "+resultSet.getString(5)+"     ");
				System.out.print("      "+resultSet.getString(6)+"     ");
				System.out.println("      "+resultSet.getString(7));
				  
		}
			
      			 System.out.println("+----------------+-----------------+---------------+----------------------+------------------+");
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void removeCar() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter user ID ");
		int id = scanner.nextInt();
		scanner.close();

		try {

			openConnection();
			query = "DELETE FROM car WHERE id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			int res = preparedStatement.executeUpdate();
			if (res == 1) {
				System.out.println("Car Remove Sucessfully");
			} else {
				System.out.println("Car not found !!!!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}

	}

	public void editCar() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Car ID ");
		int carid = scanner.nextInt();

		System.out.println("1. Edit Car Name\n" + "2. Edit Car Model\n" + "3. Edit Car Price\n" + "4. Edit Car Color\n"
				+ "5. Edit Car Brand\n" + "6. Edit FuleType\n");
		int choice1 = scanner.nextInt();
		switch (choice1) {
		case 1: {

			System.out.println("===Enter New Car Name===");
			String carname = scanner.next();

			try {

				openConnection();
				query = "UPDATE car SET name = ? Where id = ?";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, carname);
				preparedStatement.setInt(2, carid);
				int res = preparedStatement.executeUpdate();
				if (res == 1) {

					System.out.println("Name  is updated Sucessfully ");
				} else {
					System.out.println("Car not found!!!!");
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					closeConnection();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			break;
		}
		case 2: {
			System.out.println("===Enter New Model===");
			String carmodel = scanner.next();

			try {

				openConnection();
				query = "UPDATE car SET model = ? Where id = ?";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, carmodel);
				preparedStatement.setInt(2, carid);
				int res = preparedStatement.executeUpdate();
				if (res == 1) {

					System.out.println("Model  is updated Sucessfully ");
				} else {
					System.out.println("Car not found!!!!");
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					closeConnection();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			break;
		}
		case 3: {
			System.out.println("===Enter New Price===");
			double carprice = scanner.nextDouble();
			car.setPrice(carprice);
			
			try {
				
				openConnection();
				query = "UPDATE car SET price = ? Where id = ?";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setDouble(1, carprice);
				preparedStatement.setInt(2, carid);
			    int res =  preparedStatement.executeUpdate();
			    if(res == 1) {
			    
			    	System.out.println("Price  is updated Sucessfully ");
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

			break;

		}
		case 4: {
			System.out.println("===Enter New Color===");
			String carcolor = scanner.next();
			car.setColor(carcolor);
			
			try {
				
				openConnection();
				query = "UPDATE car SET color = ? Where id = ?";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, carcolor);
				preparedStatement.setInt(2, carid);
			    int res =  preparedStatement.executeUpdate();
			    if(res == 1) {
			    
			    	System.out.println("Color  is updated Sucessfully ");
			    } else {
			    	System.out.println("Car not found!!!!");
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

			break;
		}
		case 5: {
			System.out.println("===Enter New Brand");
			String carbrand = scanner.next();
			car.setBrand(carbrand);
			
			try {
				
				openConnection();
				query = "UPDATE car SET brand = ? Where id = ?";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, carbrand);
				preparedStatement.setInt(2, carid);
			    int res =  preparedStatement.executeUpdate();
			    if(res == 1) {
			    
			    	System.out.println("Brand  is updated Sucessfully ");
			    } else {
			    	System.out.println("Car not found!!!!");
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

			break;
		}
		case 6: {
			System.out.println("===Enter New FuleType");
			String fuletype = scanner.next();
			car.setFuleType(fuletype);
			
			try {
				
				openConnection();
				query = "UPDATE car SET fuletype = ? Where id = ?";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, fuletype);
				preparedStatement.setInt(2, carid);
			    int res =  preparedStatement.executeUpdate();
			    if(res == 1) {
			    
			    	System.out.println("Fuletype  is updated Sucessfully ");
			    } else {
			    	System.out.println("Car not found!!!!");
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

			break;
		}
		default: {
			System.out.println("Invalid Input !!!!!!!!!!!");
		}
		}

	}

	public void SearchCarById() {
		System.out.println("Enter Car Id");
		int id = scanner.nextInt();
		
		try {
			openConnection();
			query = "SELECT * FROM car WHERE id= ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			resultSet =  preparedStatement.executeQuery();
			if(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getDouble(4));
				System.out.println(resultSet.getString(5));
				System.out.println(resultSet.getString(6));
				System.out.println(resultSet.getString(7));
			}else {
				System.out.println("Car not found!!!!");
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

	public void SearchCarByName() {
		System.out.println("Enter Car Name");
		String name = scanner.next();
		try {
			openConnection();
			query = "SELECT * FROM car WHERE name= ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, name);
			resultSet =  preparedStatement.executeQuery();
			if(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getDouble(4));
				System.out.println(resultSet.getString(5));
				System.out.println(resultSet.getString(6));
				System.out.println(resultSet.getString(7));
			}else {
				System.out.println("Car not found!!!!");
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

	public void SearchByModel() {
		System.out.println("Enter Car Model");
		String model = scanner.next();
		try {
			openConnection();
			query = "SELECT * FROM car WHERE model= ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, model);
			resultSet =  preparedStatement.executeQuery();
			if(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getDouble(4));
				System.out.println(resultSet.getString(5));
				System.out.println(resultSet.getString(6));
				System.out.println(resultSet.getString(7));
			}else {
				System.out.println("Car not found!!!!");
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

	public void SearchByPrice() {
		
		System.out.println("Enter Car Price");
		Double price = scanner.nextDouble();
		try {
			openConnection();
			query = "SELECT * FROM car WHERE price= ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setDouble(1, price);
			resultSet =  preparedStatement.executeQuery();
			if(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getDouble(4));
				System.out.println(resultSet.getString(5));
				System.out.println(resultSet.getString(6));
				System.out.println(resultSet.getString(7));
			}else {
				System.out.println("Car not found!!!!");
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

	public void SearchByColor() {
		System.out.println("Enter Car Color");
		String color = scanner.next();
		try {
			openConnection();
			query = "SELECT * FROM car WHERE color= ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, color);
			resultSet =  preparedStatement.executeQuery();
			if(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getDouble(4));
				System.out.println(resultSet.getString(5));
				System.out.println(resultSet.getString(6));
				System.out.println(resultSet.getString(7));
			}else {
				System.out.println("Car not found!!!!");
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

	public void SearchByBrand() {
		System.out.println("Enter Car Brand");
		String brand = scanner.next();
		try {
			openConnection();
			query = "SELECT * FROM car WHERE brand= ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, brand);
			resultSet =  preparedStatement.executeQuery();
			if(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getDouble(4));
				System.out.println(resultSet.getString(5));
				System.out.println(resultSet.getString(6));
				System.out.println(resultSet.getString(7));
			}else {
				System.out.println("Car not found!!!!");
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

	public void SearchByFuleType() {
		System.out.println("Enter Car FuelType");
		String fuelType = scanner.next();
		try {
			openConnection();
			query = "SELECT * FROM car WHERE fuletype= ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, fuelType);
			resultSet =  preparedStatement.executeQuery();
			if(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getDouble(4));
				System.out.println(resultSet.getString(5));
				System.out.println(resultSet.getString(6));
				System.out.println(resultSet.getString(7));
			}else {
				System.out.println("Car not found!!!!");
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
		if (resultSet != null) {
			resultSet.close();
		}
		if (connection != null) {
			connection.close();
		}
	}

}
