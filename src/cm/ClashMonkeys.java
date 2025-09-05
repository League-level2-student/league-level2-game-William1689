package cm;

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





public class ClashMonkeys extends JPanel implements ActionListener, KeyListener {

public static final int WIDTH = 1920;
public static final int HEIGHT = 900;

JFrame frame;
Timer timer;
Cursor cursor = new Cursor(1920/2,450,30,30);


public ClashMonkeys() {
	frame = new JFrame();

	
}
public void setup() {
	frame.setTitle("Clash Monkeys");
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
	
	
cursor.draw(g);

	

}

public void update(){
	
}







public static void main(String[] args) {
	ClashMonkeys game = new ClashMonkeys();
	game.setup();

}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
cursor.update();
repaint();
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	if (e.getKeyCode() == KeyEvent.VK_UP) {
		cursor.movingUp = true;
		System.out.println("up key pressed");
	}
	if(e.getKeyCode() == KeyEvent.VK_DOWN) {
		cursor.movingDown = true;
	}
	if(e.getKeyCode() == KeyEvent.VK_LEFT) {
		cursor.movingLeft = true;
	}
	if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
				cursor.movingRight = true;
			}
		

}
  
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	if (e.getKeyCode() == KeyEvent.VK_UP) {
		cursor.movingUp = false;
		System.out.println("let go");
	}
	if(e.getKeyCode() == KeyEvent.VK_DOWN) {
		cursor.movingDown = false;
	}
	if(e.getKeyCode() == KeyEvent.VK_LEFT) {
		cursor.movingLeft = false;
	}
	if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
				cursor.movingRight =false;
	}
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}




}