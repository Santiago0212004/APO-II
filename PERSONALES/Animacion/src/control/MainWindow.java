package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MainWindow implements Initializable{

    @FXML
    private Canvas canvas;
    
    private GraphicsContext gc;
    private boolean isAlive = true;
    private int x = 20;
    private int y = 20;
    private boolean isMovingRight = true;
    private boolean isMovingTop = false;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		gc = canvas.getGraphicsContext2D();
		
		//Motor de renderizado
		new Thread(()->{
			while(isAlive) {
				try {
					paint();
					Thread.sleep(1);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}).start();
		
	}
	
	public void paint() throws InterruptedException {
		

		gc.setFill(Color.BLACK);
		
		gc.fillRect(0,0,canvas.getWidth(),canvas.getHeight());
		
		gc.setFill(Color.RED);
		gc.fillOval(x, y, 100, 100);
		
		gc.setStroke(Color.rgb(255,0,255));
		gc.strokeRect(y, x, 101, 101);
		
		gc.setFill(Color.WHITE);
		gc.fillRect(y, x, 100, 100);
		
			
		if(isMovingRight) {
			x+=5;
		} else {
			x-=5;
		}
		
		if((x+100)>=canvas.getWidth()) {
			isMovingRight = false;
		}
		
		if(x<=0) {
			isMovingRight = true;
		}
		
		if(isMovingTop) {
			y++;
		} else {
			y--;
		}
		
		if((y+100)>=canvas.getHeight()) {
			isMovingTop = false;
		}
		
		if(y<=0) {
			isMovingTop = true;
		}
			
		
			
	}
		

}
