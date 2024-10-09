package com.jspider.ManytoOne.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jspider.ManytoOne.dto.EmployeeDTO;


public class EmployeeDAO2 {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		
	
		
		openConnection();
		entityTransaction.begin();
		
		
		List<EmployeeDTO> employees = findAll();
		for(EmployeeDTO  employee : employees) {
			System.out.println(employee);
		}
		
      
        

		entityTransaction.commit();
		closeConnection();
		
	}
	
	@SuppressWarnings("unchecked")
	public static List<EmployeeDTO> findAll() {
		
		Query query = entityManager.createQuery("Select employee from EmployeeDTO employee");
		List<EmployeeDTO> employees = query.getResultList();
		return employees;
		
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
