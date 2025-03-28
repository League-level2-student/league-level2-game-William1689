import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements KeyListener, ActionListener{
Player player = new Player(Blob.WIDTH/2,Blob.HEIGHT/2,40,40);
Timer frameDraw; 

public GamePanel() {
	frameDraw = new Timer(1000/60,this);
	frameDraw.start();
}


@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	if (e.getKeyCode() == KeyEvent.VK_UP) {
		player.movingUp = true;
	}
	if (e.getKeyCode() == KeyEvent.VK_DOWN) {
		player.movingDown = true;
	}

	if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
		player.movingRight = true;
	}

	if (e.getKeyCode() == KeyEvent.VK_LEFT) {
		player.movingLeft = true;
	}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			player.movingUp = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			player.movingDown = false;
		}

		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			player.movingRight = false;
		}

		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			player.movingLeft = false;
		}
	}

	

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		player.draw(g);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
		
	}

}
