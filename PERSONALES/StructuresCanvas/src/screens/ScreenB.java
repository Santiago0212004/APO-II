package screens;

import java.util.ArrayList;

import control.MainWindow;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import model.Avatar;
import model.Enemy;
import model.EnemyBullet;
import model.Bullet;

public class ScreenB extends BaseScreen {

	//Objetos sobre el escenario
	private Avatar avatar;
	private ArrayList<Bullet> bullets;
	private Enemy enemy;
	
	public ScreenB(Canvas canvas) {
		super(canvas);
		avatar = new Avatar(canvas);
		bullets = new ArrayList<>();
		enemy = new Enemy(canvas);
	}

	@Override
	public void paint() {
		gc.setFill(Color.WHITE);
		gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
		
		for(int i = 0; i<bullets.size(); i++) {
			bullets.get(i).paint();
			if( !(bullets.get(i) instanceof EnemyBullet) && (bullets.get(i).getX()>canvas.getWidth())) {
				bullets.remove(i);
				i--;
			} else if((bullets.get(i) instanceof EnemyBullet) && (bullets.get(i).getX()<=1)) {
				bullets.remove(i);
				i--;
			}
		}
		
		if(avatar!=null) {
			avatar.paint();
			
			for(int i=0; i<bullets.size(); i++) {
				Bullet b = bullets.get(i);
				
				if((b instanceof EnemyBullet) && avatar!=null) {
					double D = Math.sqrt(
							Math.pow(b.getX()-avatar.getX(),2)+
							Math.pow(b.getY()-avatar.getY(),2)
							
					);
					
					if(D <= 40){
						bullets.remove(i);
						avatar = null;
					}
					System.out.println(D);
				}
				
			}
		}
		
		if(enemy!=null) {
			enemy.paint();
			
			for(int i=0; i<bullets.size(); i++) {
				Bullet b = bullets.get(i);
				
				if(!(b instanceof EnemyBullet) && enemy!=null) {
					double D = Math.sqrt(
							Math.pow(b.getX()-enemy.getX(),2)+
							Math.pow(b.getY()-enemy.getY(),2)
							
					);
					
					if(D <= 40){
						bullets.remove(i);
						enemy = null;
					}
					System.out.println(D);
				}
				
			}
		}

	}

	@Override
	public void onClick(MouseEvent e) {
		MainWindow.SCREEN = (MainWindow.SCREEN + 1)%2;
	}
	
	@Override
	public void onKey(KeyEvent e) {
		
		if(avatar!=null) {
			if(e.getCode().equals(KeyCode.W)) {
				avatar.moveY(-2);
			} else if(e.getCode().equals(KeyCode.A)) {
				avatar.moveX(-2);
			} else if(e.getCode().equals(KeyCode.S)) {
				avatar.moveY(2);
			} else if(e.getCode().equals(KeyCode.D)) {
				avatar.moveX(2);
			} else if(e.getCode().equals(KeyCode.SPACE)) {
				bullets.add(new Bullet(canvas,avatar.getX(),avatar.getY()));
			}
		}
		

		if(enemy!=null) {
			if(e.getCode().equals(KeyCode.UP)) {
				enemy.moveY(-2);
			} else if(e.getCode().equals(KeyCode.LEFT)) {
				enemy.moveX(-2);
			} else if(e.getCode().equals(KeyCode.DOWN)) {
				enemy.moveY(2);
			} else if(e.getCode().equals(KeyCode.RIGHT)) {
				enemy.moveX(2);
			} else if(e.getCode().equals(KeyCode.P)) {
				bullets.add(new EnemyBullet(canvas,enemy.getX(),enemy.getY()));
			}
		}

	}

}
