package tag;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Player extends GameObject implements ActionListener {

	boolean movingUp = false;
	boolean movingDown = false;
	boolean movingRight = false;
	boolean movingLeft = false;
	
	boolean dashUp = false;
	boolean dashDown = false;
	boolean dashRight = false;
	boolean dashLeft = false;
	
	boolean dashing = false;
	boolean canDash = true;
	
	Timer cooldown;
	Timer dashAnimation ;
	
	Color color;

	public Player(int x, int y, int width, int height, Color color) {
		super(x, y, width, height, color);
		this.color = color;
		speed = 7;
		
		cooldown  = new Timer(4000,this);
		dashAnimation = new Timer(1000/30,this);
		
	}
	public Projectile getProjectile() {
		return new Projectile(x+width/2, y, 10, 10);
	}
@Override
public void update() {
	// TODO Auto-generated method stub
	
	if(movingUp == true) {
		up();
	}
	if(movingDown == true) {
		down();
	}
	if(movingLeft == true) {
		left(); 
	}
	if(movingRight == true) {
		right();
	}
	if(dashing == true) {
		dash();
	}
	if(dashing == false) {
		cooldown.start();
	}

	

	super.update();
}


	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, width, height);
		
	
	}
	public void dash() {
		dashDown = movingDown;
		dashUp = movingUp;
		dashRight = movingRight;
		dashLeft = movingLeft;
		dashAnimation.start();
		
	
	}
	public void right() {
		if(x<Tag.WIDTH-this.width){
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

		if(y<Tag.HEIGHT-this.height) {
			y+=speed;
		}
	}
	
	int frameCount = 0;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == dashAnimation) {
			frameCount ++;
			if(frameCount == 10) {
				dashAnimation.stop();
				frameCount = 0;
				dashing = false;
				return;
			}
			if(dashRight) {
				x+=20;
				
			}
			if(dashDown) {
				y+=20;
				
			}
			if(dashUp) {
				y-=20;
				
			}
			if(dashLeft) {
				x-=20;
				
			}
		}
	}
	

}
