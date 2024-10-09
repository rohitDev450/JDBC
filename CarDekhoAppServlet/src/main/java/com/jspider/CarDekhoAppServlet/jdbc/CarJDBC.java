package com.jspider.CarDekhoAppServlet.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jspider.CarDekhoAppServlet.object.Car;
import com.mysql.cj.jdbc.Driver;

public class CarJDBC {
	private static Driver driver;
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet;
	private static String query;

	public static void openConnection() throws SQLException {
		driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
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
		DriverManager.deregisterDriver(driver);
	}

	public static int addCar(int id, String name, String brand, Double price) {
		int res = 0;
		try {
			openConnection();
			query = "INSERT INTO car VALUES(?,?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, brand);
			preparedStatement.setDouble(4, price);
			res = preparedStatement.executeUpdate();
			System.out.println(res + "rows(s) affected");

			closeConnection();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return res;
	}

	public static List<Car> ViewAllCar() {

		List<Car> cars = new ArrayList<Car>();

		try {

			openConnection();
			query = "SELECT * FROM car";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Car car = new Car();
				car.setId(resultSet.getInt(1));

				car.setName(resultSet.getString(2));
				car.setBrand(resultSet.getString(3));
				car.setPrice(resultSet.getDouble(4));
				cars.add(car);

			}
			closeConnection();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return cars;
	}

	public static int deleteCar(int id) {
		int res = 0;
		try {

			openConnection();
			query = "DELETE FROM car WHERE id =?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			res = preparedStatement.executeUpdate();

			closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return res;

	}

	public static int updateCar(int id, String name) {
		int res = 0;
		try {
			openConnection();
			query = "UPDATE car SET name = ? Where id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, id);
			res = preparedStatement.executeUpdate();

			closeConnection();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;

	}

	public static List<Car> serchId(int id) {

		List<Car> cars = new ArrayList<Car>();

		try {

			openConnection();
			query = "SELECT * FROM car WHERE id= ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Car car = new Car();
				car.setId(resultSet.getInt(1));

				car.setName(resultSet.getString(2));
				car.setBrand(resultSet.getString(3));
				car.setPrice(resultSet.getDouble(4));
				cars.add(car);

			}
			closeConnection();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return cars;

	}

	public static List<Car> searchName(String name) {
		List<Car> cars = new ArrayList<Car>();

		try {

			openConnection();
			query = "SELECT * FROM car WHERE name= ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, name);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Car car = new Car();
				car.setId(resultSet.getInt(1));

				car.setName(resultSet.getString(2));
				car.setBrand(resultSet.getString(3));
				car.setPrice(resultSet.getDouble(4));
				cars.add(car);

			}
			closeConnection();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return cars;
	}

	public static List<Car> searchBrand(String brand) {
		List<Car> cars = new ArrayList<Car>();

		try {

			openConnection();
			query = "SELECT * FROM car WHERE brand= ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, brand);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Car car = new Car();
				car.setId(resultSet.getInt(1));

				car.setName(resultSet.getString(2));
				car.setBrand(resultSet.getString(3));
				car.setPrice(resultSet.getDouble(4));
				cars.add(car);

			}
			closeConnection();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return cars;
	}

	public static List<Car> searchPrice(double price) {
		List<Car> cars = new ArrayList<Car>();

		try {

			openConnection();
			query = "SELECT * FROM car WHERE price= ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setDouble(1, price);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Car car = new Car();
				car.setId(resultSet.getInt(1));
				car.setName(resultSet.getString(2));
				car.setBrand(resultSet.getString(3));
				car.setPrice(resultSet.getDouble(4));
				cars.add(car);

			}
			closeConnection();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return cars;
	}

}
