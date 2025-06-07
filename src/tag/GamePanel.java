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
	Timer enemySpawn;
	private Timer frameDraw;
	ObjectManager manager;


	public GamePanel() {
		frameDraw = new Timer(1000/60,this);
		frameDraw.start();
		player = new Player(820,450,40,40,Color.BLUE);
		player2 = new Player(1100,450,40,40,Color.GREEN);
		manager = new ObjectManager(player, player2);
		
				


	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		repaint();
update();
	}

	private void update() {
		// TODO Auto-generated method stub
		player.update();
		player2.update();
		
	}
	private void draw() {
		// TODO Auto-generated method stub


	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		player.draw(g);
		player2.draw(g);
		

	}
public void gameStart() {
	enemySpawn = new Timer(90, manager);
	enemySpawn.start();
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
		if(e.getKeyCode()== KeyEvent.VK_T) {
			player.dashing = true;
		}
		if(e.getKeyCode()== KeyEvent.VK_R) {
		
		}
		
		
		
		
		
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			player2.movingUp = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			player2.movingDown = true;
		}

		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			player2.movingRight = true;
		}

		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			player2.movingLeft = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_L) {
			player2.dashing = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_K) {

			manager.addProjectile(new Projectile(player2.x, player2.y, 40, 40));
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
		
		
		
		
		
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			player2.movingUp = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			player2.movingDown = false;
		}

		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			player2.movingRight = false;
		}

		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			player2.movingLeft = false;
		}
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}		