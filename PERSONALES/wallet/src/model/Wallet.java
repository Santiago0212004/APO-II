package model;

import exception.*;

public class Wallet {

	private double capacidad;
	private double plataDisponible;
	private String propietarioId;
	
	
	
	public Wallet(double capacidad, double plataDisponible, String propietarioId) {
		this.capacidad = capacidad;
		this.plataDisponible = plataDisponible;
		this.propietarioId = propietarioId;
	}
	
	public double getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	public double getPlataDisponible() {
		return plataDisponible;
	}
	public void setPlataDisponible(double plataDisponible) {
		this.plataDisponible = plataDisponible;
	}
	public String getPropietarioId() {
		return propietarioId;
	}
	public void setPropietarioId(String propietarioId) {
		this.propietarioId = propietarioId;
	}
	public void meterPlata(double cantidad) {
		this.plataDisponible -= cantidad;
	}
	public void sacarPlata(double cantidad) throws NotEnoughMoneyException, NegativeMoneyException {
		
		//Situacion 1
		if(cantidad>this.plataDisponible) {
			//Lanzar excepcion
			throw new NotEnoughMoneyException(this.plataDisponible, cantidad);
		}else if(cantidad<0){
			//Lanzar excepcion
			throw new NegativeMoneyException();
		}else {
			this.plataDisponible -= cantidad;
		}
	}


}
