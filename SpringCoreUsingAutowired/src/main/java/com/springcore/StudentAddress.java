package com.springcore;

public class StudentAddress {
	private String villageName;
	private String city;
	
	
	public StudentAddress(String villageName, String city) {
		super();
		this.villageName = villageName;
		this.city = city;
	}


	public StudentAddress() {
		super();
	}


	public String getVillageName() {
		return villageName;
	}


	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "StudentAddress [villageName=" + villageName + ", city=" + city + "]";
	}
	
	
	
}
