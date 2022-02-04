package model;

import java.util.Date;

public class Vehicle {
	public Date entryDate;
	public String licensePlate;
	public String driverId;
	public Type type;
	
	
	public Vehicle(String licensePlate, String driverId, Type type) {
		this.entryDate = new Date();
		this.licensePlate = licensePlate;
		this.driverId = driverId;
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

	
	public String getDriverId() {
		return driverId;
	}


	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}


	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}
	
	
}
