package main;

import model.Car;
import model.CarData;

public class Main {

	public static void main(String[] args) {
		CarData data = new CarData();
		

		//data.addCar(new Car("Santiago Barraza","BMW"));
		//data.addCar(new Car("Pepe Perez","Chevrolet"));
		//data.addCar(new Car("Armando Paredes","Audi"));
		
		System.out.println("\n");
		//data.saveJSON();
		data.loadJSON();

		
	}

}
