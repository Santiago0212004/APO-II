package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonData {
	
	ArrayList<Person> people;
	
	public PersonData() {
		people = new ArrayList<>();
		Person A = new Person("Santiago",17,"Barranquilla");
		Person B = new Person("Sebastián",17,"Bogotá");
		Person C = new Person("Juan Manuel",19,"Cali");
		Person D = new Person("Fabiana",18," Yopal");
		Person E = new Person("Andy",19,"Cali");
		Person F = new Person("Jose",18,"Cali");
		
		people.add(A);
		people.add(B);
		people.add(C);
		people.add(D);
		people.add(E);
		people.add(F);
	}
	
	public void print() {
		for(Person p : people) {
			System.out.println(p.getName()+", "+p.getAge()+", "+p.getCity());
		}
	}
	
	public void sortByName() {
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person A, Person B) {
				return A.getName().compareTo(B.getName());
			}
		});
	}
	public void sortByAge() {
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person A, Person B) {
				return A.getAge() - B.getAge();
			}
		});
	}
	public void sortByCity() {
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person A, Person B) {
				return A.getCity().compareTo(B.getCity());
			}
		});
	}
	
}
