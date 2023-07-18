package com.spring.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.model.Employee;
import com.spring.jpa.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/get")
	public String getMono(@RequestBody String string) {
		return string;
	}

	@GetMapping("/GetEmployee")
	public List<Employee> getEmployee() {
		List<Employee> emp = employeeService.findAll();
		return emp;
	}

	@PostMapping("/AddEmployee")
	public String addEmployee(@RequestBody Employee employee) {
		return employeeService.save(new Employee(employee.getName(), employee.getPhonenumber(), employee.getLocation(),
				employee.getDesignation()));
	}

	@PutMapping("/UpdateEmployee")
	public String UpdateEmployee(@RequestBody Employee employee) {
			return employeeService.update(employee);
	}

	@DeleteMapping("/DeleteEmployee/{id}")
	public String DeleteEmployee(@PathVariable int id) {
		return employeeService.delete(id);
	}

	@DeleteMapping("/DeleteAll")
	public String DeleteEmployee() {
		return employeeService.deleteAll();
	}
}
