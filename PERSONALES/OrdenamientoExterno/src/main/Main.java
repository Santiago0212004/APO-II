package main;

import model.*;

public class Main {
	public static void main(String[] args) {
		PersonData data = new PersonData();
		
		Person p = new Person("Pepe",18,"Nueva York");
	
		data.sortByName();
		
		data.print();
		
		Clickeable c = (a,b)->{
			System.out.println(a+" "+b);
		};
		
		p.setOnClick(c);
	}
}
