package com.example.springcoreLifeCycle;

import javax.security.auth.Destroyable;

import org.springframework.beans.factory.InitializingBean;

public class Student {
	private int id;
	private String name;
	private String contact;
	
	public Student(int id, String name, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public void  init() {
		System.out.println("init function is colling.... !"); 
	}
	
	public void destroy() {
		System.out.println("this ditroid method ....!");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}

	
	

}
