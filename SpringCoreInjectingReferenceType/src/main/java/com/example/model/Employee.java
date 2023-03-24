package com.example.model;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private String employeeLastName;
	private EmployeeContact employeeContact;
	private EmployeeAddress employeeAddress;
	
	
	
	public Employee() {
		super();
	}


	public Employee(int employeeId, String employeeName, String employeeLastName, EmployeeContact employeeContact,
			EmployeeAddress employeeAddress) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeLastName = employeeLastName;
		this.employeeContact = employeeContact;
		this.employeeAddress = employeeAddress;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getEmployeeLastName() {
		return employeeLastName;
	}


	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}


	public EmployeeContact getEmployeeContact() {
		return employeeContact;
	}


	public void setEmployeeContact(EmployeeContact employeeContact) {
		this.employeeContact = employeeContact;
	}


	public EmployeeAddress getEmployeeAddress() {
		return employeeAddress;
	}


	public void setEmployeeAddress(EmployeeAddress employeeAddress) {
		this.employeeAddress = employeeAddress;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeLastName="
				+ employeeLastName + ", " + employeeContact + ", " + employeeAddress
				+ "]";
	}
	
	
	

}
