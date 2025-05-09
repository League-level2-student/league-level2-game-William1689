
package tag;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Tag {

	public static final int WIDTH = 1920;
	public static final int HEIGHT = 900;
	JFrame frame;
	GamePanel panel;

	public Tag() {
		frame = new JFrame();
		panel = new GamePanel();
	}
	public void setup() {
		frame.setTitle("Tag");
		frame.add(panel);
		frame.setVisible(true);
		panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(panel);

	}	









	public static void main(String[] args) {
		Tag game = new Tag();
		game.setup();

	}



}