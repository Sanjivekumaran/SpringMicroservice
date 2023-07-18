package com.spring.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.microservice.feign.JpaFeign;
import com.spring.microservice.model.Employee;

@Service
public class ToStringService {
	
	@Autowired
	JpaFeign feign;

	public String getEmployeeInString() {
		List<Employee> employee = feign.getEmployee();
		return employee.toString();
	}
}
