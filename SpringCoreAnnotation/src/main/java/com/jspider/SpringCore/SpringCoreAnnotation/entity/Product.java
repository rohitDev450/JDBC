package com.jspider.SpringCore.SpringCoreAnnotation.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component(value="product")
public class Product {
	
	@Value("1")
	private int id;
	@Value("Laptop")
	private String name;
	@Value("Digital")
	private String catagery;

}
