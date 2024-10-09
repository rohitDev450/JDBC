package com.jspider.springrest.service;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.springrest.pojo.User;
import com.jspider.springrest.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User adduser(User user) {
		return userRepository.addUser(user);
	}
	
	public User validateUser(String userName, String password) {
         try {		
        	  User user = userRepository.validateUser(userName, password);
        	  return user;
         } catch(NoResultException e) {
        	 return null;
         }
	}
	
	public User updateUser(User user) {
		return ((UserRepository) userRepository).updateUser(user);
	}

	public User deleteUser(int id) {
		return userRepository.deleteUser(id);
	}

	public User updateCarListForUser(int userId, int carId) {
		return userRepository.updateCarListForUser(userId, carId);
	}
}
