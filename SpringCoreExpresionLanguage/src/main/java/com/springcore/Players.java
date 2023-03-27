package com.springcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Players {
	
	@Value("virat")
	private String name;
	@Value("20")
	private int age;
	public Players(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Players() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Players [name=" + name + ", age=" + age + "]";
	}
	
	
	

}
