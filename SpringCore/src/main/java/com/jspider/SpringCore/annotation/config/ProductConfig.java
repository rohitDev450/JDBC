package com.jspider.SpringCore.annotation.config;

import org.springframework.context.annotation.Bean;

import com.jspider.SpringCore.entity.Product;

public class ProductConfig {
	
	@Bean(name ="product")
	public Product getProduct() {
		return new Product();
	}

}
