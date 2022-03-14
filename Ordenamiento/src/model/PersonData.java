package model;

import java.util.ArrayList;
import java.util.Collections;

public class PersonData {
	private ArrayList<Person> people;
	
	public PersonData() {
		people = new ArrayList<>();
	}
	
	public void sortPeople() {
		Collections.sort( people);
	}
	
	public void addPerson(Person person) {
		people.add(person);
	}
	
	public void print() {
		for(Person p : people) {
			System.out.println(p.getName()+" "+p.getLastName()+" | "+(long)p.getIncomes()+" | "+p.getCity());
		}
	}
	
}
