package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactBookTest {
	
	//State
	private ContactBook contactBook;
	
	//Escenarios
	public void setupStage2() {
		contactBook = null;
	}
	public void setupStage3() {
		contactBook = new ContactBook();
	}
	public void setupStage4() {
		contactBook = new ContactBook();
		contactBook.addContact(new Contact("A","B","C"));
		contactBook.addContact("Alfa","Beta","Gamma");
		contactBook.addContact(new Contact("UNO","DOS","TRES"));
	}
	
	@Test
	void test() {
		setupStage3();
		String name = "Pablo Herrera";
		String email="pablo@icesi.edu.co";
		String phone="3112345678";

		contactBook.addContact(new Contact(name,email,phone));
		
		//Assert
		int size = contactBook.getContacts().size();
		
		assertEquals(size, 1);
		
		Contact contact = contactBook.getContacts().get(0);
		assertEquals(name, contact.getName());
		assertEquals(email, contact.getEmail());
		assertEquals(phone, contact.getPhone());
	}
	
	@Test
	
	void sameEmailTest() {
		setupStage4();
		boolean resultado = contactBook.addContact(new Contact("UNO","DOS","TRES"));
		
		//assert
		assertEquals(contactBook.getContacts().size(),3);
		assertFalse(resultado);
		
	}

}
