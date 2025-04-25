package tag;
import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject {

	boolean movingUp = false;
	boolean movingDown = false;
	boolean movingRight = false;
	boolean movingLeft = false;
	
	boolean movingUp1 = false;
	boolean movingDown1 = false;
	boolean movingRight1 = false;
	boolean movingLeft1 = false;
	Color color;

	public Player(int x, int y, int width, int height, Color color) {
		super(x, y, width, height);
		this.color = color;
		speed = 7;
	}

	public void draw(Graphics g) {
		g.setColor(color);
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
