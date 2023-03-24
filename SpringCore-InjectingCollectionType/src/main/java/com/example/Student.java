package com.example;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	
	private String empName;
	private List<String> empPhones;
	private Set<String>  empAddresses;
	private Map<String,String> empCourses;
	
	public Student(String empName, List<String> empPhones, Set<String> empAddresses, Map<String, String> empCourses) {
		super();
		this.empName = empName;
		this.empPhones = empPhones;
		this.empAddresses = empAddresses;
		this.empCourses = empCourses;
	}

	public Student() {
		super();
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<String> getEmpPhones() {
		return empPhones;
	}

	public void setEmpPhones(List<String> empPhones) {
		this.empPhones = empPhones;
	}

	public Set<String> getEmpAddresses() {
		return empAddresses;
	}

	public void setEmpAddresses(Set<String> empAddresses) {
		this.empAddresses = empAddresses;
	}

	public Map<String, String> getEmpCourses() {
		return empCourses;
	}

	public void setEmpCourses(Map<String, String> empCourses) {
		this.empCourses = empCourses;
	}

	@Override
	public String toString() {
		return "Student [empName=" + empName + ", empPhones=" + empPhones + ", empAddresses=" + empAddresses
				+ ", empCourses=" + empCourses + "]";
	}
	
	
	
	
	
	

}
