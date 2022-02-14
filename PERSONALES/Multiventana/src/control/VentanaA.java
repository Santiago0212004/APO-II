package control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.Main;

public class VentanaA implements Initializable{

    @FXML
    private TextField emailTF;

    @FXML
    private Button submitBTM;
    
    private String email;
    
    public VentanaA() {
    	email = "ejemplo@dominio.com";
    	
    }
    
    @FXML
    void submit(ActionEvent event) throws Exception {
    	
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/VentanaB.fxml"));
		loader.setController(new VentanaB(emailTF.getText()));
		
		
		
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
		
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		emailTF.setText(email);
	}
	
	

}