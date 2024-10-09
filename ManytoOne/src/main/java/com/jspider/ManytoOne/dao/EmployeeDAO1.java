package com.jspider.ManytoOne.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.ManytoOne.dto.CompanyDTO;
import com.jspider.ManytoOne.dto.EmployeeDTO;


public class EmployeeDAO1 {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		
	
		
		openConnection();
		entityTransaction.begin();
		
		EmployeeDTO employee = new EmployeeDTO();
		employee.setName("Kartik");
		employee.setEmail("kartik@gmail.com");
		employee.setMobile(5678901273l);
		
		CompanyDTO company = entityManager.find(CompanyDTO.class, 1);
		
		employee.setCompany(company);
		
		entityManager.persist(employee);

		entityTransaction.commit();
		closeConnection();
		
	}
	
	public static void openConnection() {
		  
		  entityManagerFactory = Persistence.createEntityManagerFactory("employee");
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
