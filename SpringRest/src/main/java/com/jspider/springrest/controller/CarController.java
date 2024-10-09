package com.jspider.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jspider.springrest.pojo.Car;
import com.jspider.springrest.response.ResponseStructure;
import com.jspider.springrest.service.CarService;

@RestController
@CrossOrigin(origins = "http://localhost:3001")
public class CarController {
	
	@Autowired
	private CarService carService;
	
	@PostMapping(path = "/car")
	public ResponseEntity<ResponseStructure<Car>> addCar(@RequestBody Car car) {
		Car added = carService.addcar(car);
		ResponseStructure<Car> responseStructure = new ResponseStructure<>();
		responseStructure.setMessage("Car Added");
		responseStructure.setData(added);
		responseStructure.setStatus(HttpStatus.OK.value());
		return  new ResponseEntity<ResponseStructure<Car>>(responseStructure, HttpStatus.OK);
	  
	}
	
	@GetMapping("/cars")
	public ResponseEntity<ResponseStructure<List<Car>>>findAllCars(){
		List<Car> cars = carService.findAllCars();
		ResponseStructure<List<Car>> responseStructure = new ResponseStructure<>();
		if(cars!=null) {
			responseStructure.setMessage("Car Found");
			responseStructure.setData(cars);
			responseStructure.setStatus(HttpStatus.FOUND.value());
			return new ResponseEntity<ResponseStructure<List<Car>>>(responseStructure, HttpStatus.FOUND);
		}else {
			responseStructure.setMessage("Car Not Found");
			responseStructure.setData(cars);
			responseStructure.setStatus(HttpStatus.NOT_FOUND.value());
			return new ResponseEntity<ResponseStructure<List<Car>>>(responseStructure, HttpStatus.NOT_FOUND);
		}
		
	}
	
	@PutMapping("/car")
	public ResponseEntity<ResponseStructure<Car>> carupdate(@RequestBody Car car){
		Car carToBeUpdated =carService.carUpdate(car);
		ResponseStructure<Car> responseStructure = new ResponseStructure<Car>();
		if(carToBeUpdated !=null) {
			responseStructure.setMessage("Car Updated");
			responseStructure.setData(carToBeUpdated);
			responseStructure.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<Car>>(responseStructure, HttpStatus.OK);
		}else {
			responseStructure.setMessage("Car not Found!!!");
			responseStructure.setData(carToBeUpdated);
			responseStructure.setStatus(HttpStatus.NOT_FOUND.value());
			return new ResponseEntity<ResponseStructure<Car>>(responseStructure, HttpStatus.NOT_FOUND);
			
		}
	}
	
	@DeleteMapping(path = "/car")
	public ResponseEntity<ResponseStructure<Car>> deleteCar(@RequestParam(name = "carId") int carId) {
		Car deletedCar = carService.deleteCar(carId);
		ResponseStructure<Car> responseStructure = new ResponseStructure<>();
		if (deletedCar != null) {
			responseStructure.setMessage("Car deleted");
			responseStructure.setData(deletedCar);
			responseStructure.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<Car>>(responseStructure, HttpStatus.OK);
		} else {
			responseStructure.setMessage("Car not found");
			responseStructure.setData(deletedCar);
			responseStructure.setStatus(HttpStatus.NOT_FOUND.value());
			return new ResponseEntity<ResponseStructure<Car>>(responseStructure, HttpStatus.NOT_FOUND);
		}
	}

}
