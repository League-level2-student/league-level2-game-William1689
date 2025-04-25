package tag;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements KeyListener, ActionListener {

	Player player;
	Player player2;
	private Timer frameDraw;


	public GamePanel() {
		frameDraw = new Timer(1000/60,this);
		frameDraw.start();
		player = new Player(960,450,40,40,Color.BLUE) ;


	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		repaint();

	}

	private void draw() {
		// TODO Auto-generated method stub


	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		player.draw(g);

	}



	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_W) {
			player.movingUp = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			player.movingDown = true;
		}

		if (e.getKeyCode() == KeyEvent.VK_D) {
			player.movingRight = true;
		}

		if (e.getKeyCode() == KeyEvent.VK_A) {
			player.movingLeft = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_W) {
			player.movingUp = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			player.movingDown = false;
		}

		if (e.getKeyCode() == KeyEvent.VK_D) {
			player.movingRight = false;
		}

		if (e.getKeyCode() == KeyEvent.VK_A) {
			player.movingLeft = false;
		}
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}		