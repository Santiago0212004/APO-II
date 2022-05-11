package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import control.MainWindow;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Avatar {

	private Canvas canvas;
	private GraphicsContext gc;

	
	private Image image;
	
	public Avatar(Canvas canvas) {
		this.canvas = canvas;
		gc = canvas.getGraphicsContext2D();
		
		File file = new File("src/image/goku.png");
		try {
			image = new Image(new FileInputStream(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void paint() {
		gc.drawImage(image, MainWindow.x, MainWindow.y);
	}
	
	public void moveX(int xMove) {
		MainWindow.x += xMove;
	}
	
	public void moveY(int yMove) {
		MainWindow.y += yMove;
	}
	
}
