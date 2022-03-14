package main;

import model.Person;
import model.PersonData;

public class Natural {

	public static void main(String[] args) {
		PersonData data = new PersonData();
		
		data.addPerson(new Person("Iv�n","Duque",115000000,"Bogot�"));
		data.addPerson(new Person("Enrique","Pe�alosa",50000000,"Bogot�"));
		data.addPerson(new Person("Gilberto","Tob�n",10000000,"Medell�n"));
		data.addPerson(new Person("Federico","Guti�rrez",90000000,"Medell�n"));
		data.addPerson(new Person("Francia","Marquez",70000000,"Cali"));
		data.addPerson(new Person("Christian","Garc�s",25000000,"Cali"));
		data.addPerson(new Person("Maria Fernanda","Cabal",80000000,"Cali"));
		data.addPerson(new Person("Alvaro","Uribe",120000000,"Medell�n"));
		data.addPerson(new Person("Gustavo","Petro",115000000,"Bogot�"));
		
		data.sortPeople();
		
		data.print();
		
	}

}
