package com.jspider.OnetoOne.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "person")
public class PersonDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int id;
	private  String name;
	private  long mobile;
	private  int age;
	@OneToOne
	private  AddharDTO addharCard;
	

}
