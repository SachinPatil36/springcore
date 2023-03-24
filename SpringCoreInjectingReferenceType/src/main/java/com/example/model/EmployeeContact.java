package com.example.model;

public class EmployeeContact {
	
	private String  contact;
	private String gmail;
	
	public EmployeeContact() {
		super();
	}

	public EmployeeContact(String contact, String gmail) {
		super();
		this.contact = contact;
		this.gmail = gmail;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	@Override
	public String toString() {
		return "EmployeeContact [contact=" + contact + ", gmail=" + gmail + "]";
	}

	
	
	
	

}
