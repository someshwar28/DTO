package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@SpringBootApplication
public class IntegrationTestApplication implements CommandLineRunner {
	
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	Map<String,Object>map=new HashMap<>();

	String name="someshwar";

	public static void main(String[] args) {
		SpringApplication.run(IntegrationTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Employee employee=new Employee(101, "someshwar", "pune");
		
		employeeRepository.save(employee);
		
	}

}
