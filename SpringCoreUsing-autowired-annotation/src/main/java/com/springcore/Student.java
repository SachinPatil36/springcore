package com.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private int studentId;
	private String studentName;
	
	//we can use hear @Autowired
	private StudentAddress studentAddress;
	
	
	public Student(int studentId, String studentName, StudentAddress studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	
	@Autowired
	public Student(StudentAddress studentAddress) {
		super();
		this.studentAddress = studentAddress;
	}
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public StudentAddress getStudentAddress() {
		return studentAddress;
	}
	
	
	public void setStudentAddress(StudentAddress studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	
	

	
	
	
	
	
}
