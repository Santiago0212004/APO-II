package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
		codeCol.setCellValueFactory(new PropertyValueFactory<>("code"));
		idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
		
		studentTable.setItems(StudentData.data);
		
	}
	
	@FXML
    void addStudent(ActionEvent event) {
		StudentData.data.add(new Student("Santiago Barraza", 1044607243, "A00375190"));
    }

}
