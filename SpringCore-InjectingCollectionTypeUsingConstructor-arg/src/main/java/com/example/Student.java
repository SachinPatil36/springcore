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

	
	@Override
	public String toString() {
		return "Student [empName=" + empName + ", empPhones=" + empPhones + ", empAddresses=" + empAddresses
				+ ", empCourses=" + empCourses + "]";
	}
	
	
	
	
	
	

}
