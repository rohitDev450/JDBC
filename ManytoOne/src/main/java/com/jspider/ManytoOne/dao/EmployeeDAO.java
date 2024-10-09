package com.jspider.ManytoOne.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.ManytoOne.dto.CompanyDTO;
import com.jspider.ManytoOne.dto.EmployeeDTO;


public class EmployeeDAO {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		
		EmployeeDTO employee = new EmployeeDTO();
		employee.setName("Anuj");
		employee.setEmail("anuj@gmail.com");
		employee.setMobile(5678901243l);
		
		CompanyDTO company = new CompanyDTO();
		company.setName("Tata");
		company.setLocation("Pune");
		
		employee.setCompany(company);
		
		openConnection();
		entityTransaction.begin();
		
		entityManager.persist(company);
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
