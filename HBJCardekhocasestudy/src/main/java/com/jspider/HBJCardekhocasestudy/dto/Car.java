package com.jspider.HBJCardekhocasestudy.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Car {
	
	@Id
	private int id;
    private String name;
	private String model;		
	private double price;
	private String color;
	private String brand;
	private String fuleType;
	

}
