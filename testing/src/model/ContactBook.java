package model;

import java.util.ArrayList;

public class ContactBook {
	private ArrayList<Contact> contacts;

	public ContactBook() {
		contacts = new ArrayList<Contact>();
	}
	
	public boolean addContact(Contact contact) {
		
		boolean repeated = false;
		
		for(Contact c : contacts) {
			if(c.getEmail().equalsIgnoreCase(contact.getEmail())){
				repeated = true;
				break;
			}
		}
		
		if(repeated==false) {
			contacts.add(contact);
		}
		
		
		return repeated;
	}
	
	public boolean addContact(String name, String email, String phone) {
		
		boolean repeated = false;
		
		for(Contact c : contacts) {
			if(c.getEmail().equalsIgnoreCase(email)){
				repeated = true;
				break;
			}
		}
		
		if(repeated==false) {
			Contact contact = new Contact(name, email, phone);
			contacts.add(contact);
		}
		
		return repeated;
	}
	
	public ArrayList<Contact> getContacts(){
		return contacts;
	}
	
}
