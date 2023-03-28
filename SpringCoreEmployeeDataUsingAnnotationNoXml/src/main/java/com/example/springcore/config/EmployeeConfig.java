package com.example.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.springcore.entity.Address;
import com.example.springcore.entity.Employee;

@Configuration
public class EmployeeConfig {
	
	@Bean("employee")
	public Employee getEmployeeObj() {
		
		Employee emp=new Employee();
		
		return emp;
	}
	
	@Bean("address")
	public Address getAddressObj() {
		
		Address add=new Address();
		
		return add;  
		
	}

}
