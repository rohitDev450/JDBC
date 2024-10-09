package com.jspider.OnetoMany.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.OnetoMany.dto.CompanyDTO;
import com.jspider.OnetoMany.dto.EmployeeDTO;



public class ComapnyDAO {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		
	   CompanyDTO company = new CompanyDTO();
	   company.setName("Tata");
	   company.setLocation("Pune");
	   
	   EmployeeDTO employee1 = new EmployeeDTO();
	   employee1.setName("Suresh");
	   employee1.setEmail("suresh@gmail.com");
	   employee1.setMobile(6523097694l);
	   
	   EmployeeDTO employee2 = new EmployeeDTO();
	   employee2.setName("Mahesh");
	   employee2.setEmail("mahesh@gmail.com");
	   employee2.setMobile(6523097635l);
	   
	   EmployeeDTO employee3 = new EmployeeDTO();
	   employee3.setName("Ganesh");
	   employee3.setEmail("ganesh@gmail.com");
	   employee3.setMobile(6523597646l);
			  
	   List<EmployeeDTO> employee = new ArrayList<EmployeeDTO>();
	   employee.add(employee1);
	   employee.add(employee2);
	   employee.add(employee3);
		
		company.setEmployee(employee);
		
		openConnection();
		entityTransaction.begin();
		
		entityManager.persist(employee1);
		entityManager.persist(employee2);
		entityManager.persist(employee3);
		
		entityManager.persist(company);

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
