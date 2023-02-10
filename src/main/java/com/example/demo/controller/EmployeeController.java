package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(value = "/getAllEmployeeData")
	public List<EmployeeDto> getAllEmployeeDtoObject(){
		
		return employeeService.getAllEmployeeObject();
	}
	
	@PostMapping(value = "/addEmployeeData")
	public EmployeeDto saveEmployeeObject(@RequestBody Employee employee) {
		
		return employeeService.saveEmployeeObject(employee);
		
	}
	
	@GetMapping(value = "getEmployeeData/{eid}")
	public EmployeeDto getEmployeeObject(@PathVariable int eid) {
		
		return employeeService.getEmployeeObject(eid);
		
	}
	
	
	
	

}
