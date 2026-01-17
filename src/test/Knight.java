package test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.Timer;




public class Knight extends GameObject implements ActionListener{
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	public static BufferedImage image;
	
	boolean movingUp = false;
	boolean movingDown = false;
	boolean movingRight = false;
	boolean movingLeft = false;
	
	boolean stabUp = false;
	boolean stabDown = false; 
	boolean stabRight = false;
	boolean stabLeft = false;
	boolean stabbing = false;
	
	Color color;
	
int speed = 9;
	
	Timer stabAnimation ;
	public Knight(int x, int y, int width, int height, Color color) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
		this.color = color;
		
		stabAnimation = new Timer(1000/30, this);
	};

	public void draw(Graphics g) {

		if (gotImage) {
			g.drawImage(image, x, y, width, height, null);
		}else {
			g.setColor(color);
			g.fillRect(x, y, width, height);
		}
	}
	public void update() {
		if(movingDown == true) {
			down();
		}
		if(movingUp == true)
		{
			up();
		}
		if(movingLeft == true) {
			left();
		}
		if(movingRight == true) {
			right();
		}
		if(stabbing == true) {
			
		}

	}

	public void right() {
		if(x<Game.WIDTH-this.width){
			x+=speed;
		}
	}
	public void left() {
		if(x>0) {
			x-=speed;
		}

	}
	public void up() {
		if(y>0) {
			y-=speed;

		}
	}
	public void down() {

		if(y<Game.HEIGHT-this.height) {
			y+=speed;
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	} 


}

