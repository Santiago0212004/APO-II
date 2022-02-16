package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class VentanaB implements Initializable{
	
	@FXML
	private TextArea emailTA;
	
	@FXML
    private Button refreshBTM;
	
	public VentanaB() {
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		emailTA.setText("");
		for(String email: EmailsData.emails) {
			emailTA.appendText(email+"\n\n");
		}
		
	}
	
   
    @FXML
    void refresh(ActionEvent event) {
    	emailTA.setText("");
		for(String email: EmailsData.emails) {
			emailTA.appendText(email+"\n\n");
		}
    }
	
}
