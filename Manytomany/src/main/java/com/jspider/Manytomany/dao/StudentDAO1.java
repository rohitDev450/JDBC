package com.jspider.Manytomany.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.Manytomany.dto.StudentDTO;

public class StudentDAO1 {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	public static void main(String[] args) {

		
	
		openConnection();
		entityTransaction.begin();

		StudentDTO student1 = entityManager.find(StudentDTO.class, 2);
		student1.setCourses(null);
		
		entityManager.persist(student1);
		entityManager.remove(student1);
		
		entityTransaction.commit();
		closeConnection();
	}

	public static void openConnection() {

		entityManagerFactory = Persistence.createEntityManagerFactory("student");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
	}

	public static void closeConnection() {

		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
		if (entityManager != null) {
			entityManager.close();
		}
		if (entityTransaction != null) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
	}


}
