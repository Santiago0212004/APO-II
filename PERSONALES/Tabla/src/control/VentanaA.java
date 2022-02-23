package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import main.Main;
import model.Student;
import model.StudentData;

public class VentanaA implements Initializable {

	@FXML
    private TableColumn<Student, String> nameCol;
	
    @FXML
    private TableColumn<Student, String> codeCol;

    @FXML
    private TableColumn<Student, Integer> idCol;


    @FXML
    private TableView<Student> studentTable;
    
    @FXML
    private Button addBTN;
    
    private Student stClicked;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
		codeCol.setCellValueFactory(new PropertyValueFactory<>("code"));
		idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
		
		studentTable.setItems(StudentData.data);
		
		studentTable.setOnMouseClicked(event -> {
			stClicked = studentTable.getSelectionModel().getSelectedItem();
		});
	}
	
    @FXML
    void addStudent(ActionEvent event) throws Exception {
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/VentanaB.fxml"));
		loader.setController(new VentanaB());
		Parent parent = (Parent) loader.load();
		Stage stage = new Stage();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.show();
		
    }

    @FXML
    void exit(ActionEvent event) {
    	Platform.exit();
    	System.exit(0);
    }
	
    @FXML
    void delete(ActionEvent event) {
    	StudentData.data.remove(stClicked);
    }
	
	
}
