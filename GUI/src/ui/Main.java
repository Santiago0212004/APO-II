package ui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) {
		
		try {
		
			//Cargador del FXML
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("MainWindow.fxml"));
			
			//Contenido de la ventana
			Parent parent = (Parent) loader.load();
			
			
			Stage stage = new Stage();
			Scene scene = new Scene(parent);
			
			stage.setScene(scene);
			
			stage.show();
		
		} catch (IOException ex){
			ex.printStackTrace();
		}
	}

}
