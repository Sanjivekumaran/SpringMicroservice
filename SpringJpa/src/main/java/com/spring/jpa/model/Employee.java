package com.spring.jpa.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table
public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
