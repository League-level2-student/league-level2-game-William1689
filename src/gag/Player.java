package gag;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import tag.Tag;

public class Player extends GameObject {
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	public static BufferedImage image;
	boolean movingUp = false;
	boolean movingDown = false;
	boolean movingRight = false;
	boolean movingLeft = false;


	public Player(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
		speed = 10;
		
	}
	public void draw(Graphics g) {

        if (gotImage) {
        	g.drawImage(image, x, y, width, height, null);
        } else {
        	g.setColor(Color.BLUE);
        	g.fillRect(x, y, width, height);
        }
	}
    

public void update( ) {
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
		
		super.update();
}
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
}


