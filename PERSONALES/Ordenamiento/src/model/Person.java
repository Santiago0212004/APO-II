package model;

public class Person implements Comparable<Person> {
	private String name;
	private String lastName;
	private double incomes;
	private String city;
	
	public Person(String name, String lastName, double incomes, String city) {
		this.name = name;
		this.lastName = lastName;
		this.incomes = incomes;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getIncomes() {
		return incomes;
	}

	public void setIncomes(double incomes) {
		this.incomes = incomes;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int compareTo(Person o) {
		Person A = this;
		Person B = o;
		
		int output = A.getCity().compareTo(B.getCity());
		if(output==0) {
			output = (int) (B.getIncomes() - A.getIncomes());
			if(output==0) {
				output = A.getLastName().compareTo(B.getLastName());
				if(output==0) {
					output = A.getName().compareTo(B.getName());
				}
			}
		}
		
		return output;
	}

}
