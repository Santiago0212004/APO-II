package screens;

import control.MainWindow;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import main.Avatar;

public class ScreenB extends BaseScreen {

	//Objetos sobre el escenario
	private Avatar avatar;
	
	public ScreenB(Canvas canvas) {
		super(canvas);
		
		avatar = new Avatar(canvas);
	}

	@Override
	public void paint() {
		gc.setFill(Color.WHITE);
		gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
		avatar.paint();
	}

	@Override
	public void onClick(MouseEvent e) {
		MainWindow.SCREEN = (MainWindow.SCREEN + 1)%2;	
	}
	
	@Override
	public void onKey(KeyEvent e) {
		if(e.getCode().equals(KeyCode.W)) {
			avatar.moveY(-2);
		} else if(e.getCode().equals(KeyCode.A)) {
			avatar.moveX(-2);
		} else if(e.getCode().equals(KeyCode.S)) {
			avatar.moveY(2);
		} else if(e.getCode().equals(KeyCode.D)) {
			avatar.moveX(2);
		}
		
	}

}
