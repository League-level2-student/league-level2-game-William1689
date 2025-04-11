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

Player player1;
Player player2;
private Timer frameDraw;


public GamePanel() {
	frameDraw = new Timer(1000/60,this);
	frameDraw.start();
	player1 = new Player(500,500,40,40,Color.BLUE) ;
	player2 = new Player(500,250,40,40,Color.RED);
	
}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		draw();
		
	}

	private void draw() {
		// TODO Auto-generated method stub
		
		
	}
	
	@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			player1.draw(g);
			player2.draw(g);
		}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
