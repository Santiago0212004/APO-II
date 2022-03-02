package model;

import java.io.Serializable;

public class Car implements Serializable{
	
	private String ownerName;
	private String brand;
	
	
	public Car() {
		
	}
	
	public Car(String ownerName, String brand) {
		this.ownerName = ownerName;
		this.brand = brand;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
