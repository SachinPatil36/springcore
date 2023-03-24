package com.example.SpringCoreTestingForConformation;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private String employeeAddress;
	
	
	public Employee(int employeeId, String employeeName, String employeeAddress) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}

	

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + "]";
	}
	
	
	
	
	

}
