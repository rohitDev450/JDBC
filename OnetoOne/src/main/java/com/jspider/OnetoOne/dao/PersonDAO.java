package com.jspider.OnetoOne.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.OnetoOne.dto.AddharDTO;
import com.jspider.OnetoOne.dto.PersonDTO;

public class PersonDAO {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		
		PersonDTO person = new PersonDTO();
		person.setName("umesh");
		person.setMobile(2167348907l);
		person.setAge(21);
		
		AddharDTO addhar = new AddharDTO();
		addhar.setAddharcard(235678997647l);
		
		person.setAddharCard(addhar);
		
		
		openConnection();
		entityTransaction.begin();
		
		entityManager.persist(addhar);
		entityManager.persist(person);
		
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
