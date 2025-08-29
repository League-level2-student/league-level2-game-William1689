package gag;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.Timer;



public class GrowAGarden extends JPanel implements KeyListener, ActionListener {
	public static final int WIDTH = 1920;
	public static final int HEIGHT = 900;
	Player player = new Player(1920/2,450,40,40);
	JFrame frame;
	Timer timer;
	

	public GrowAGarden() {
		frame = new JFrame();
		
	}
	public void setup() {
		frame.setTitle("Grow A Garden");
		timer = new Timer(100/6, this);
		frame.add(this);
		frame.setVisible(true);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener( this);
		setBackground(Color.green);
		timer.start();
	}	
	private void draw() {
		
	}

	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		
		player.draw(g);
	
		

	}







	public static void main(String[] args) {
		GrowAGarden game = new GrowAGarden();
		game.setup();

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
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
		player.update();
	}

 
}
