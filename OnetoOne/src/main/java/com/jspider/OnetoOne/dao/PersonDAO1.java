package com.jspider.OnetoOne.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.jspider.OnetoOne.dto.AddharDTO;
import com.jspider.OnetoOne.dto.PersonDTO;

public class PersonDAO1 {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		
		
		openConnection();
		entityTransaction.begin();
		
		PersonDTO person = entityManager.find(PersonDTO.class, 3);
		AddharDTO addhar = person.getAddharCard();
		
		entityManager.remove(addhar);
		entityManager.remove(person);
		
		entityTransaction.commit();
		closeConnection();
		
	}
	
	public static void openConnection() {
		  
		  entityManagerFactory = Persistence.createEntityManagerFactory("Person");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
	}
	
     public static void closeConnection() {
	   
	   if(entityManagerFactory !=null) {
		   entityManagerFactory.close();
	   }
	   if(entityManager !=null) {
		   entityManager.close();
	   }
	   if(entityTransaction !=null) {
		   if(entityTransaction.isActive()) {
			   entityTransaction.rollback();
		   }
	   }
 }

}
