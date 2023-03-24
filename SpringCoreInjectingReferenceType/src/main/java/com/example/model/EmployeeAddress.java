package com.example.model;

public class EmployeeAddress {
	
	private String VillageName;
	private String city;
	private String state;
	private int pincode;
	
	
	public EmployeeAddress() {
		super();
	}


	public EmployeeAddress(String villageName, String city, String state, int pincode) {
		super();
		VillageName = villageName;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}


	public String getVillageName() {
		return VillageName;
	}


	public void setVillageName(String villageName) {
		VillageName = villageName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "EmployeeAddress [VillageName=" + VillageName + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + "]";
	}
	
	

}
