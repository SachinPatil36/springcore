package com.example.springcoreLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean ,DisposableBean  {
	
	double empSalary;

	public Employee(double empSalary) {
		super();
		this.empSalary = empSalary;
	}

	public Employee() {
		super();
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empSalary=" + empSalary + "]";
	}

	public void destroy() throws Exception {
		System.out.println("hello this is using interface distroy---");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("this is using intertface init ----");
		
	}
	
	
	

}
