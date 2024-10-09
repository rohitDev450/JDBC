package com.jspider.hibernatejpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.hibernatejpa.dto.StudentDTO;

public class StudentDAO2 {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		
		openConnection();
		entityTransaction.begin();
		
		StudentDTO student = entityManager.find(StudentDTO.class, 3);
		student.setMobile(7823569054l);
		entityManager.persist(student);
		
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
