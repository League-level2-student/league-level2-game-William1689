package tag;

import javax.swing.Timer;

public class Potato extends GameObject {
Timer timer;
	public Potato(int x, int y, int width, int height, Timer timer) {
		super(x, y, width, height);
		this.timer = timer;
		
	}

}
