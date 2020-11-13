package PingPong;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class KeyInput extends KeyAdapter {

	private Paddle lPaddle;
	private boolean up1 = false;
	private boolean down1 = false;

	private Paddle rPaddle; 
	private boolean up = false;
	private boolean down = false;

	
	public KeyInput(Paddle p1, Paddle p2) {

		lPaddle = p1;
		rPaddle = p2;

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_UP) {
			rPaddle.switchDirections(-1);
			up = true;
		}
		if (key == KeyEvent.VK_DOWN) {
			rPaddle.switchDirections(1);
			down = true;
		}
		if (key == KeyEvent.VK_W) {
			lPaddle.switchDirections(-1);
			up1 = true;
		}
		if (key == KeyEvent.VK_S) {
			lPaddle.switchDirections(1);
			down1 = true;
		}

		// exit
		if (key == KeyEvent.VK_ESCAPE) {
			System.exit(1);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_UP) {
			up = false;
		}
		if (key == KeyEvent.VK_DOWN) {
			down = false;
		}
		if (key == KeyEvent.VK_W) {
			up1 = false;
		}
		if (key == KeyEvent.VK_S) {
			down1 = false;
		}

		if (!up1 && !down1)
			lPaddle.stop();
		if (!up && !down)
			rPaddle.stop();

		
	}

}
