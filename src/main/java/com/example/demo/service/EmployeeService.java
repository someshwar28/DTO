package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<EmployeeDto> getAllEmployeeObject(){
		
		return employeeRepository.findAll()
				.stream().map(this::convertEntityToDto)
				.toList();
	}
	
	public EmployeeDto convertEntityToDto(Employee employee) {
		
		EmployeeDto employeeDto=new EmployeeDto();
		
		employeeDto.setEid(employee.getEid());
		employeeDto.setEname(employee.getEname());
		
		return employeeDto;
		
	}

	public EmployeeDto saveEmployeeObject(Employee employee) {
		
		Employee save = employeeRepository.save(employee);
		
		 return this.convertEntityToDto(save);
		
	}
	
		public EmployeeDto getEmployeeObject(int eid) {
		
		 Optional<Employee> findById = employeeRepository.findById(eid);
		 
		  Employee orElse = findById.orElse(null);
		  
		  return this.convertEntityToDto(orElse);
		
	}


}
