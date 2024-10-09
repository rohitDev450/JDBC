package com.jspider.SpringCore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.SpringCore.entity.Company;

public class CompanyMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("company_employee.xml");
		Company company = (Company) applicationContext.getBean("company");
		System.out.println(company);
		((ClassPathXmlApplicationContext) applicationContext).close();
	}

}