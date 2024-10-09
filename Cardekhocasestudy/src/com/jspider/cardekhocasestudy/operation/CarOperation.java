package com.jspider.cardekhocasestudy.operation;

import java.util.ArrayList;
import java.util.Scanner;

import com.jspider.cardekhocasestudy.entity.Car;

public class CarOperation {
	
	Scanner scanner = new Scanner(System.in);
	ArrayList<Car> cars = new ArrayList<Car>();
	Car car = new Car();

	public void CarAdd() {
		Car car = new Car();
		System.out.println("Enter Car Id");
		int carid = scanner.nextInt();
		System.out.println("Enter Car Name");
		String carname = scanner.next();
		System.out.println("Enter Car Model");
		String carmodel = scanner.next();
		System.out.println("Enter Car Price");
		double carprice = scanner.nextDouble();
		System.out.println("Enter Car Brand");
		String carbrand = scanner.next();
		System.out.println("Enter Car Color");
		String carcolor = scanner.next();
		System.out.println("Enter Car fuelType");
		String fuletype = scanner.next();
		car.setId(carid);
		car.setName(carname);
		car.setModel(carmodel);
		car.setPrice(carprice);
		car.setBrand(carbrand);
		car.setColor(carcolor);
		car.setFuleType(fuletype);
		cars.add(car);
		System.out.println(car);
		System.out.println("Car Added");

	}

	public void ViewAllCars() {

		if (cars.size() > 0) {
			for (Car car : cars) {
				System.out.println(car);
			}
		} else {
			System.out.println("Cars Not Found");

		}

	}

	public void removeCar() {
		boolean flag = false;
		System.out.println("Enter Car Id");
		int id = scanner.nextInt();
		for (Car car : cars) {
			if (car.getId() == id) {
				flag = true;
				cars.remove(car);
				System.out.println("Car Removed");
				break;
			}
		}
		if (!flag) {
			System.out.println("Cars Not Found");
		}

	}

	public void editCar() {
		boolean flag = false;
		System.out.println("Enter Car Id You Want To Edit");
		int id = scanner.nextInt();
		for (Car car : cars) {
			if (car.getId() == id) {
				flag = true;
				System.out.println("1. Edit Car Name\n" + "2. Edit Car Model\n" + "3. Edit Car Price\n"
						+ "4. Edit Car Color\n" + "5. Edit Car Brand\n" + "6. Edit FuleType\n");
				int choice1 = scanner.nextInt();
				switch (choice1) {
				case 1: {
					System.out.println("===Enter New Name===");
					String carname = scanner.next();
					car.setName(carname);
					break;
				}
				case 2: {
					System.out.println("===Enter New Model===");
					String carmodel = scanner.next();
					car.setModel(carmodel);
					break;
				}
				case 3: {
					System.out.println("===Enter New Price===");
					double carprice = scanner.nextDouble();
					car.setPrice(carprice);
					break;

				}
				case 4: {
					System.out.println("===Enter New Color===");
					String carcolor = scanner.next();
					car.setColor(carcolor);
					break;
				}
				case 5: {
					System.out.println("===Enter New Brand");
					String carbrand = scanner.next();
					car.setColor(carbrand);
					break;
				}
				case 6: {
					System.out.println("===Enter New FuleType");
					String fuletype = scanner.next();
					car.setFuleType(fuletype);
					break;
				}
				default: {
					System.out.println("Invalid Input");
				}
				}
				break;
			}
		}
		if (!flag) {
			System.out.println("Cars Not Found");
		}

	}

	public void SearchCarById() {
		System.out.println("Enter Car Id");
		int id = scanner.nextInt();
		for (Car car : cars) {
			if (car.getId() == id) {
				System.out.println(car);
				break;
			} else {
				System.out.println("Cars Not Found");
			}

		}

	}

	public void SearchCarByName() {
		System.out.println("Enter Car Name");
		String name = scanner.next();
		for (Car car : cars) {
			if (car.getName() == name) {
				System.out.println(car);
				break;
			} else {
				System.out.println("Cars Not Found");
			}
		}
	}

	public void SearchByModel() {
		System.out.println("Enter Car Model");
		String model = scanner.next();
		for (Car car : cars) {
			if (car.getModel() == model) {
				System.out.println(car);
				break;
			} else {
				System.out.println("Cars Not Found");
				break;
			}
		}
	}

	public void Filter1() {
		for (Car car : cars) {
			if (car.getPrice() > 0 && car.getPrice() <= 100000) {
				System.out.println(car);
				break;
			} else {
				System.out.println("Car Not Found");
				break;
			}
		}
	}

	public void Filter2() {
		for (Car car : cars) {
			if (car.getPrice() > 100000 && car.getPrice() <= 1000000) {
				System.out.println(car);
				break;
			} else {
				System.out.println("Car Not Found");
				break;
			}
		}
	}

	public void Filter3() {
		for (Car car : cars) {
			if (car.getPrice() > 1000000) {
				System.out.println(car);
				break;
			} else {
				System.out.println("Car Not Found");
			}
		}
	}

	public void SearchByColor() {
		System.out.println("Enter Car Color");
		String color = scanner.next();
		for (Car car : cars) {
			if (car.getColor() == color) {
				System.out.println(car);
				break;
			} else {
				System.out.println("Cars Not Found");
			}
		}
	}

	public void SearchByBrand() {
		System.out.println("Enter Car Brand");
		String brand = scanner.next();
		for (Car car : cars) {
			if (car.getBrand() == brand) {
				System.out.println(car);
				break;
			} else {
				System.out.println("Cars Not Found");
			}
		}
	}

	public void SearchByFuleType() {
		System.out.println("Enter Car FuelType");
		String fuelType = scanner.next();
		for (Car car : cars) {
			if (car.getFuleType() == fuelType) {
				System.out.println(car);
				break;
			} else {
				System.out.println("Cars Not Found");
			}
		}
	}

}
