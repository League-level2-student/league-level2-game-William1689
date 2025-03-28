import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Blob {

public static final int WIDTH = 1920;
public static final int HEIGHT = 900;
JFrame frame;
GamePanel panel;

public Blob() {
	frame = new JFrame();
	panel = new GamePanel();
}
public void setup() {
		frame.setTitle("Blob");
		frame.add(panel);
		frame.setVisible(true);
		panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(panel);
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Blob game = new Blob();
		game.setup();	
}

}
