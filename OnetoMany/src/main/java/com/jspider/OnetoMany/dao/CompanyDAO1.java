package com.jspider.OnetoMany.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.OnetoMany.dto.CompanyDTO;

public class CompanyDAO1 {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		
	   
		openConnection();
		entityTransaction.begin();
		
		CompanyDTO company = entityManager.find(CompanyDTO.class, 1);
		entityManager.remove(company);
		
		
		entityTransaction.commit();
		closeConnection();
		
	}
	
	public static void openConnection() {
		  
		  entityManagerFactory = Persistence.createEntityManagerFactory("company");
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
