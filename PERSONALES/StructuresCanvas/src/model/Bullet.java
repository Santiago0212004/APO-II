package model;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Bullet {
	protected Canvas canvas;
	protected GraphicsContext gc;
	
	protected int x,y;
	protected int size;
	protected int speed;
	
	public Bullet(Canvas canvas, int x, int y) {
		 this.canvas = canvas;
		 this.gc = canvas.getGraphicsContext2D();
		 this.x = x;
		 this.y = y;
		 this.size = 10;
		 this.speed = 1;
	}
	
	public void paint() {
		gc.setFill(Color.BLUE);
		gc.fillOval(x, y, size, size);
		x+=speed;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}
