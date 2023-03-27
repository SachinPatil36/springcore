package com.example;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Phone {
	double cost;
	 List<String> phoneName;
	 Map<String ,String> pasword;
	 
	 Properties properties;

	public Phone(double cost, List<String> phoneName, Map<String, String> pasword, Properties properties) {
		super();
		this.cost = cost;
		this.phoneName = phoneName;
		this.pasword = pasword;
		this.properties = properties;
	}

	public Phone() {
		super();
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public List<String> getPhoneName() {
		return phoneName;
	}

	public void setPhoneName(List<String> phoneName) {
		this.phoneName = phoneName;
	}

	public Map<String, String> getPasword() {
		return pasword;
	}

	public void setPasword(Map<String, String> pasword) {
		this.pasword = pasword;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Phone [cost=" + cost + ", phoneName=" + phoneName + ", pasword=" + pasword + ", properties="
				+ properties + "]";
	}
	 
	 
	 

}
