package model;

public class User {
	private String id;
	private String name;
	private Wallet wallet;
	

	
	public User(String id, String name) {
		this.id = id;
		this.name = name;
		this.wallet = new Wallet(0,2000,id);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
}	
