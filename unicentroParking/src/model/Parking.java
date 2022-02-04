package model;

import java.util.ArrayList;

public class Parking {
	ArrayList<Vehicle> parkingVehicles;
	
	final String[] ABC = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	final String[] NUM = {"0","1","2","3","4","5","6","7","8","9"};
	
	public Parking() {
		parkingVehicles = new ArrayList<Vehicle>();
	}
	
	
	public boolean registerCar(Vehicle vehicle) {
		
		boolean valid = false;
		
		String licensePlate = vehicle.getLicensePlate();
		
		int validLetters = 0;
		
		boolean founded = false;
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<ABC.length && !founded; j++) {
				if(i<3) { //Prueba si los tres primeros caracteres son letras
					if(licensePlate.substring(i,i+1).equalsIgnoreCase(ABC[j])) {
						validLetters++;
						founded = true;
					}
				}
				else { //Prueba si los tres últimos caracteres son numeros
					if(licensePlate.substring(i,i+1).equalsIgnoreCase(NUM[j])) {
						validLetters++;
						founded = true;
					}
				}
				
			}
		}
		

		//Valida que la placa no tenga mas de seis caracteres, además comprueba si todas las letras son validad
		if(licensePlate.length()==6 && validLetters==6) {
			valid = true;
			parkingVehicles.add(vehicle);
		}
		
		return valid;
		
	}
	
	public boolean registerMotorCycle(Vehicle vehicle) {
		
		boolean valid = false;
		
		String licensePlate = vehicle.getLicensePlate();
		
		int validLetters = 0;
		
		boolean founded = false;
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<ABC.length && !founded; j++) {
				if(i<3) { //Prueba si los tres primeros caracteres son letras
					if(licensePlate.substring(i,i+1).equalsIgnoreCase(ABC[j])) {
						validLetters++;
						founded = true;
					}
				}
				else if(i<5) { //Prueba si los tres últimos caracteres son numeros
					if(licensePlate.substring(i,i+1).equalsIgnoreCase(NUM[j])) {
						validLetters++;
						founded = true;
					}
				}
				else {
					if(licensePlate.substring(i,i+1).equalsIgnoreCase(ABC[j])) {
						validLetters++;
						founded = true;
					}
				}
				
			}
		}
		
		
		if(licensePlate.length()==6 && validLetters==6) {
			valid = canEnter(licensePlate);
			parkingVehicles.add(vehicle);
		}
		
		return valid;
	}
	
	public boolean canEnter(String licensePlate) {
		return false;
	}
	
}
