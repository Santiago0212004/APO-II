package model;

import java.util.Date;

public class Vehicle {
	public Date entryDate;
	public String licensePlate;
	public Type type;
	
	
	public Vehicle(Date entryDate, String licensePlate, Type type) {
		this.entryDate = entryDate;
		this.licensePlate = licensePlate;
		this.type = type;
	}


	public Date getEntryDate() {
		return entryDate;
	}


	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}


	public String getLicensePlate() {
		return licensePlate;
	}


	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}


	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}
	
	
}
