package com.spring.microservice.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.microservice.model.Employee;

@FeignClient(name="crud-service", url="http://localhost:8080")
// url="${AUTHORIZATION_SERVICE:http://localhost:8080}"
public interface JpaFeign {

	@GetMapping("/GetEmployee")
	public  List<Employee> getEmployee();
	
}
