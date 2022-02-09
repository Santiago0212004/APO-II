package ui;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Contact;

public class MainController {
	
	ArrayList<Contact> contactsList;
	
	public MainController() {
		contactsList = new ArrayList<>();
	}

	@FXML
	private Button addBTM;

	@FXML
	private TextArea contactsTA;

	@FXML
	private Button deleteBTM;

	@FXML
	private TextField nameTF;

	@FXML
	private TextField telephoneTF;

	@FXML
	void addContact(ActionEvent event) {
		System.out.println("addContact");
		String name = nameTF.getText();
		String telephone = telephoneTF.getText();
		Contact contact = new Contact(name, telephone);
		contactsList.add(contact);
		contactsTA.appendText("Nombre: "+contact.getName()+"\nTelefono: "+contact.getTelephone()+"\n\n");
	}

	@FXML
	void deleteContact(ActionEvent event) {
		System.out.println("deleteContact");
	}

}
