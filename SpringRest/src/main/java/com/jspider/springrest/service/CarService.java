package com.jspider.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.springrest.pojo.Car;
import com.jspider.springrest.repository.CarRepository;

@Service
public class CarService {

	@Autowired
	private CarRepository carRepository;
	
	public Car addcar(Car car) {
		return carRepository.addCar(car);
	}
	
	public List<Car> findAllCars(){
		List<Car> cars = carRepository.findAllCars();
		if(cars!=null && cars.size()>0) {
			return cars;
		}else {
			return null;
		}
	}
	
	public Car carUpdate(Car car) {
		return carRepository.updateCar(car);
	}
	
	public Car deleteCar(int carId) {
		return carRepository.deleteCar(carId, carId);
	}
}
