import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject {

	boolean shootingUp = false;
	boolean shootingDown = false;
	boolean shootingRight = false;
	boolean shootingLeft = false;
	
	public Projectile(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 12;
	}
	
	public void draw(Graphics g) { 
		g.setColor(Color.green);
		g.fillOval(x, y, width, height);
	}
	
}





