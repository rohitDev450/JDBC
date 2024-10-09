package com.jspider.hibernatejpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.hibernatejpa.dto.StudentDTO;

public class StudentDAO {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	public static void main(String[] args) {
		
		openConnection();
		
		entityTransaction.begin();
		
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setId(4);
		studentDTO.setName("Rushikesh");
		studentDTO.setEmail("rushi@gmail.com");
		studentDTO.setMobile(87645475654l);
		studentDTO.setAge(23);
		
        entityManager.persist(studentDTO);
		
		entityTransaction.commit();
		
		closeConnection();
		
	}
	
	public static void openConnection() {
		  
		  entityManagerFactory = Persistence.createEntityManagerFactory("student");
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
