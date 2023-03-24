package com.example.model;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private String employeeLastName;
	private EmployeeContact employeeContact;

	
	
	
	


	public Employee(int employeeId, String employeeName, String employeeLastName, EmployeeContact employeeContact) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeLastName = employeeLastName;
		this.employeeContact = employeeContact;
		
	}







	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeLastName="
				+ employeeLastName + ", employeeContact=" + employeeContact + "]";
	}


	


	
	
	
	

}
