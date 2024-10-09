package com.jspider.SpringCore.SpringCoreAnnotation.Config;

import org.springframework.context.annotation.Bean;

import com.jspider.SpringCore.SpringCoreAnnotation.entity.Product;

public class ProductConfig {
	
	@Bean(name ="product")
	public Product getProduct() {
		return new Product();
	}

}
