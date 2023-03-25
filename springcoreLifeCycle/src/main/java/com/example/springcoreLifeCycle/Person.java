package com.example.springcoreLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person {
	String information;

	public Person(String information) {
		super();
		this.information = information;
	}

	public Person() {
		super();
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting program........");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("end the program .........");
	}

	@Override
	public String toString() {
		return "Person [information=" + information + "]";
	}
	
	

}
