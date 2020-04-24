package com.example.salaryservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/salary-service")
public class SalaryController {
	
	@GetMapping("/getSalary")
	public String getSalary() {
		return "Hello salary";
	}
	@GetMapping("/getSalaryById/{id}")
	public String getSalaryById(@PathVariable String id) {
		return "Hello Salary for id: " + id;
	}

}
