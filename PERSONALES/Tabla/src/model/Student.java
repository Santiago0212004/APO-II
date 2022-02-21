package model;

public class Student {
	
	private String name;
	private String code;
	private int id;
	
	
	public Student(String name, int id, String code) {
		this.name = name;
		this.code = code;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
