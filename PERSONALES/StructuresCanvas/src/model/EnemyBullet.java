package model;

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public class EnemyBullet extends Bullet {

	public EnemyBullet(Canvas canvas, int x, int y) {
		super(canvas, x, y);
	}
	
	public void paint() {
		super.gc.setFill(Color.RED);
		gc.fillOval(x, y, size, size);
		super.x-=super.speed;
	}

}
