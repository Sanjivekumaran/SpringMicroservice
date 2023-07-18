package com.spring.microservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Employee {
	
	private int id;

	private String name;
	
	private String location;
	
	private String phonenumber;
	
	private String designation;
	
	public Employee(String name, String phonenumber, String location, String designation){
		// TODO Auto-generated method stub
		this.designation=designation;
		this.name=name;
		this.location=location;
		this.phonenumber=phonenumber;
	}
}
