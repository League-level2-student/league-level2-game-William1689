package test;

	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.image.BufferedImage;



	public class Knight extends GameObject {
		public static boolean needImage = true;
		public static boolean gotImage = false;	
		public static BufferedImage image;
		boolean movingUp = false;
		boolean movingDown = false;
		boolean movingRight = false;
		boolean movingLeft = false;
	int speed = 9;

		public Knight(int x, int y, int width, int height) {
			super(x, y, width, height);
			// TODO Auto-generated constructor stub
		}
		public void draw(Graphics g) {

	        if (gotImage) {
	        	g.drawImage(image, x, y, width, height, null);
	        }else {
	        g.setColor(Color.GRAY);
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
	
	
	}

