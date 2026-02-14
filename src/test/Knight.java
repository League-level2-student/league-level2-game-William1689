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

	boolean dashingUp = false;
	boolean dashingDown = false;
	boolean dashingLeft = false;
	boolean dashingRight = false;
	boolean dashing = false;

	boolean damageOn = false;
	boolean canStab = true;
	boolean stabUp = false;
	boolean stabDown = false; 
	boolean stabRight = false;
	boolean stabLeft = false;
	boolean stabbing = false;




	Color color;

	int speed = 9;
	Timer cooldown;
	Timer dashAnimation ;
	Timer stabAnimation ;
	public Knight(int x, int y, int width, int height, Color color) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
		this.color = color;

		stabAnimation = new Timer(1000/110, this);
		dashAnimation = new Timer (1000/150, this);
		cooldown = new Timer(2000, this);
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
			stab();
		}
		if( dashing == true) {
			dash();
		}
		super.update();
	}
	public void stab() {
		if(canStab) {
		stabDown = movingDown;
		stabUp = movingUp;
		stabRight = movingRight;
		stabLeft = movingLeft;
		stabAnimation.start();
		canStab = false;
		cooldown.start();
		}
	}
	public void dash() {
		dashingDown = movingDown;
		dashingUp = movingUp;
		dashingLeft = movingLeft;
		dashingRight = movingRight;
		dashAnimation.start();
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
	int frameCount = 0;
	int dashFrameCount = 0;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == stabAnimation) {
			frameCount++;
			if(frameCount == 10) {
				stabAnimation.stop();
				frameCount =0;
				stabbing = false;
				return;
			}
			if(stabRight) {
				x+=13;
			}
			if(stabLeft) {
				x-=13;

			}
			if(stabDown) {
				y+=13;
			}
			if(stabUp) {
				y+=13;
			}
		}
		if(e.getSource() == cooldown) {
			cooldown.stop();
			canStab = true;
		}
		if(e.getSource() == dashAnimation){
			dashFrameCount++;

			if(dashFrameCount == 10) {
				dashAnimation.stop();
				dashFrameCount = 0;
				dashing = false;
				return;
			}
			if(dashingRight ) {
				x+=5;
			}
			if(dashingLeft) {
				x-=5;
			}
			if(dashingDown) {
				y+=5;
			}
			if(dashingUp) {
				y-=5;
			}
		}
	}








} 




