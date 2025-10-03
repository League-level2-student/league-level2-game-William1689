package test;

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



public class Game extends JPanel implements ActionListener, KeyListener {

	public static final int WIDTH = 1920;
	public static final int HEIGHT = 900;

	JFrame frame;
	Timer timer;
Knight knight = new Knight(1920/2,450,30,30);
	public Game() {
		frame = new JFrame();
	}
public void setup() {
	frame.setTitle("Game");
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
	super.paintComponent(g);
	knight.draw(g);
}


public static void main(String[] args) {
	Game game = new Game();
	game.setup();
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	if (e.getKeyCode() == KeyEvent.VK_UP) {
		knight.movingUp = true;
		
	}
	if(e.getKeyCode() == KeyEvent.VK_DOWN) {
		knight.movingDown = true;
	}
	if(e.getKeyCode() == KeyEvent.VK_LEFT) {
		knight.movingLeft = true;
	}
	if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
		knight.movingRight = true;
			}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	if (e.getKeyCode() == KeyEvent.VK_UP) {
		
	}
	if(e.getKeyCode() == KeyEvent.VK_DOWN) {
		knight.movingDown = false;
	}
	if(e.getKeyCode() == KeyEvent.VK_LEFT) {
		knight.movingLeft = false;
	}
	if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
		knight.movingRight = false;
			}
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	knight.update();
	repaint();
}


}

