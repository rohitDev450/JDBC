package com.jspider.SpringCore.SpringCoreAnnotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspider.SpringCore.SpringCoreAnnotation.Config.ProductConfig;
import com.jspider.SpringCore.SpringCoreAnnotation.Config.ProductConfig2;
import com.jspider.SpringCore.SpringCoreAnnotation.entity.Product;

public class ProductMain {
	
	public static void main(String[] args) {

		ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(ProductConfig.class);
		Product product1 = (Product) applicationContext1.getBean("product");
		System.out.println(product1);
		((AnnotationConfigApplicationContext) applicationContext1).close();
		
		ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(ProductConfig.class);
		Product product2 = (Product) applicationContext2.getBean(Product.class);
		System.out.println(product2);
		((AnnotationConfigApplicationContext) applicationContext2).close();
		
		ApplicationContext applicationContext3 = new AnnotationConfigApplicationContext("com.jspider.SpringCore");
		Product product3 = (Product) applicationContext3.getBean("product");
		System.out.println(product3);
		((AnnotationConfigApplicationContext) applicationContext3).close();

		
		ApplicationContext applicationContext4 = new AnnotationConfigApplicationContext(ProductConfig2.class);
		Product product4 = (Product) applicationContext4.getBean("product");
		System.out.println(product4);
		((AnnotationConfigApplicationContext) applicationContext4).close();
	}


}
