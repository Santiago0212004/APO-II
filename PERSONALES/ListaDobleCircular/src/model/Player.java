package model;

public class Player {
	private String name;

	public Player() {
		this.name = "NO_NAME";
	}
	
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
