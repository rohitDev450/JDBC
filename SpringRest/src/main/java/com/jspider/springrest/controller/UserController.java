package com.jspider.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.jspider.springrest.pojo.User;
import com.jspider.springrest.response.ResponseStructure;
import com.jspider.springrest.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public ResponseEntity<ResponseStructure<User>> addUser(@RequestBody User user) {
		User addedUser = userService.adduser(user);
		ResponseStructure<User> responseStructure = new ResponseStructure<User>();
		if(addedUser !=null) {
			responseStructure.setMessage("User Added");
			responseStructure.setData(user);
			responseStructure.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<User>>(responseStructure,HttpStatus.OK);
	}else {	
		responseStructure.setMessage("User Not Found");
		responseStructure.setData(user);
		responseStructure.setStatus(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<ResponseStructure<User>>(responseStructure,HttpStatus.NOT_FOUND);
	 }
  }
	
	@GetMapping("/user")
	public ResponseEntity<ResponseStructure<User>> validateUser(@RequestParam(name ="userName") String userName, @RequestParam(name ="password") String password){
		User user = userService.validateUser(userName, password);
		ResponseStructure<User> responseStructure = new ResponseStructure<User>();
		if(user !=null) {
			responseStructure.setMessage("User Found");
			responseStructure.setData(user);
			responseStructure.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<User>>(responseStructure,HttpStatus.OK);
		}else {
			responseStructure.setMessage("User Not Found, Inavlid user Name and Password");
			responseStructure.setData(user);
			responseStructure.setStatus(HttpStatus.NOT_FOUND.value());
			return new ResponseEntity<ResponseStructure<User>>(responseStructure,HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/user")
	public ResponseEntity<ResponseStructure<User>> updateUser(@RequestBody User user) {
		User updatedUser = userService.updateUser(user);
		ResponseStructure<User> responseStructure = new ResponseStructure<>();
		if (updatedUser != null) {
			responseStructure.setMessage("User updated");
			responseStructure.setData(updatedUser);
			responseStructure.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<User>>(responseStructure, HttpStatus.OK);
		} else {
			responseStructure.setMessage("User not found");
			responseStructure.setData(updatedUser);
			responseStructure.setStatus(HttpStatus.NOT_FOUND.value());
			return new ResponseEntity<ResponseStructure<User>>(responseStructure, HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/user")
	public ResponseEntity<ResponseStructure<User>> deleteUser(@RequestParam(name = "id") int id) {
		User deletedUser = userService.deleteUser(id);
		ResponseStructure<User> responseStructure = new ResponseStructure<>();
		if (deletedUser != null) {
			responseStructure.setMessage("User deleted");
			responseStructure.setData(deletedUser);
			responseStructure.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<User>>(responseStructure, HttpStatus.OK);
		} else {
			responseStructure.setMessage("User not found");
			responseStructure.setData(deletedUser);
			responseStructure.setStatus(HttpStatus.NOT_FOUND.value());
			return new ResponseEntity<ResponseStructure<User>>(responseStructure, HttpStatus.NOT_FOUND);
		}
	}

	@PatchMapping("/user")
	public ResponseEntity<ResponseStructure<User>> updateCarListForUser(@RequestParam(name = "userId") int userId,
			@RequestParam(name = "carId") int carId) {
		User updatedUser = userService.updateCarListForUser(userId, carId);
		ResponseStructure<User> responseStructure = new ResponseStructure<>();
		if (updatedUser != null) {
			responseStructure.setMessage("Car list for the user is updated");
			responseStructure.setData(updatedUser);
			responseStructure.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<User>>(responseStructure, HttpStatus.OK);
		} else {
			responseStructure.setMessage("Invalid user id or car id");
			responseStructure.setData(updatedUser);
			responseStructure.setStatus(HttpStatus.NOT_FOUND.value());
			return new ResponseEntity<ResponseStructure<User>>(responseStructure, HttpStatus.NOT_FOUND);
		}
	}

}
