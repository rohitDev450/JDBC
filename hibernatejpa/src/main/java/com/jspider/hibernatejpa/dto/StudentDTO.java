package com.jspider.hibernatejpa.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class StudentDTO {
	
	@Id
	private int id;
	private String name;
	private String email;
	private long mobile;
	private int age;
	

}
