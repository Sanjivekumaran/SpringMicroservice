package com.spring.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jpa.model.Employee;
import com.spring.jpa.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	public String save(Employee employee) {
		if (employee.getName() == null) {
			return "Name missing";
		} else if (employee.getPhonenumber() == null) {
			return "Phonenumber missing";
		} else if (employee.getLocation() == null) {
			return "Location missing";
		} else if (employee.getDesignation() == null) {
			return "Designation missing";
		}
		employeeRepository.save(employee);
		return "Saved Successfully";
	}

	public String update(Employee employee) {
		// TODO Auto-generated method stub
		Optional<Employee> empl = employeeRepository.findById(employee.getId());
		if (empl.isEmpty()) {
			return "No employee exist";
		} else {
			Employee updateEmployee = Employee.builder().id(empl.get().getId()).name(employee.getName()).location(employee.getLocation())
					.phonenumber(employee.getPhonenumber()).designation(employee.getDesignation()).build();
			employeeRepository.save(updateEmployee);
			return "Updated Successfully";
		}
	}

	public String delete(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> empl = employeeRepository.findById(id);
		if (empl.isEmpty()) {
			return "No employee exist";
		} else {
			employeeRepository.deleteById(id);
			return "Delete Successfully";
		}
		

	}
	
	public String deleteAll() {
		employeeRepository.deleteAll();
		return "Deleted Successfully";
	}
}
