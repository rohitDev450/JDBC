package com.jspider.Manytomany.dao;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.Manytomany.dto.CourseDTO;
import com.jspider.Manytomany.dto.StudentDTO;

public class StudentDAO {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	public static void main(String[] args) {

		StudentDTO student1 = new StudentDTO();
		student1.setName("Rohit");
		student1.setEmail("rohit@gmail.com");
		student1.setMobile(4567890322l);

		StudentDTO student2 = new StudentDTO();
		student2.setName("Rahul");
		student2.setEmail("rahul@gmail.com");
		student2.setMobile(4567898944l);

		CourseDTO course1 = new CourseDTO();
		course1.setName("SQL");
		course1.setFees(10000.00);

		CourseDTO course2 = new CourseDTO();
		course2.setName("CORE JAVA");
		course2.setFees(10000.00);

		CourseDTO course3 = new CourseDTO();
		course3.setName("WEB TECH");
		course3.setFees(20000.00);

		student1.setCourses(Arrays.asList(course1, course2));
		student2.setCourses(Arrays.asList(course2, course3));

		openConnection();
		entityTransaction.begin();

		entityManager.persist(student1);
		entityManager.persist(student2);
		
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
