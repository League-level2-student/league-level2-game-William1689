import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject {

	boolean movingUp = false;
	boolean movingDown = false;
	boolean movingRight = false;
	boolean movingLeft = false;
	
	
	public Player(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 6;
	}

public void draw(Graphics g) {
g.setColor(Color.blue);
g.fillOval(x, y, width, height);

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
	
	super.update();
}
public void right() {
	   if(x<Blob.WIDTH-this.width){
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
	    
		if(y<Blob.HEIGHT-this.height) {
			y+=speed;
		}
	}


}
