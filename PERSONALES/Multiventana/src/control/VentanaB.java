package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class VentanaB implements Initializable{
	
	@FXML
	private TextArea emailTA;
	
	private String email;
	
	public VentanaB(String email) {
		this.email = email;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		emailTA.setText(email);
		
	}
	
	
}
