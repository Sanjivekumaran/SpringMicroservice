package com.spring.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.microservice.service.ToStringService;

@RestController
public class ToStringController {
	
	@Autowired
	ToStringService service;
	
	@GetMapping("/EmployeeString")
	public String getEmployee() {
		return service.getEmployeeInString();
	}
}
