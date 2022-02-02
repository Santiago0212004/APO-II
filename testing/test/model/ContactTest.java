package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {
	
	//Estado
	
	private Contact contact;
	
	//Escenarios
	public void setupStage1() {
		contact = null;
	}
	
	
	@Test
	void createNewContact() {
		//Poner el escenario
		setupStage1();
		contact = new Contact("Andres Andrade","aandrade@icesi.edu.co","3023235492");
		
		assertNotNull(contact);
		assertEquals("Andres Andrade", contact.getName());
		assertEquals("aandrade@icesi.edu.co", contact.getEmail());
		assertEquals("3023235492", contact.getPhone());
	}

}
