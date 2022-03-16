package main;

import model.Person;
import model.PersonData;

public class Natural {

	public static void main(String[] args) {
		PersonData data = new PersonData();
		
		data.addPerson(new Person("Iván","Duque",115000000,"Bogotá"));
		data.addPerson(new Person("Enrique","Peñalosa",50000000,"Bogotá"));
		data.addPerson(new Person("Gilberto","Tobón",10000000,"Medellín"));
		data.addPerson(new Person("Federico","Gutiérrez",90000000,"Medellín"));
		data.addPerson(new Person("Francia","Marquez",70000000,"Cali"));
		data.addPerson(new Person("Christian","Garcés",25000000,"Cali"));
		data.addPerson(new Person("Maria Fernanda","Cabal",80000000,"Cali"));
		data.addPerson(new Person("Alvaro","Uribe",120000000,"Medellín"));
		data.addPerson(new Person("Gustavo","Petro",115000000,"Bogotá"));
		
		data.sortPeople();
		
		data.print();
		
	}

}
