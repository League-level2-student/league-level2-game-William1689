package gag;

import java.awt.Dimension;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import javax.swing.JPanel;



public class GrowAGarden {
	public static final int WIDTH = 1920;
	public static final int HEIGHT = 900;
	JFrame frame;
	JPanel panel;

	public GrowAGarden() {
		frame = new JFrame();
		panel = new JPanel();
	}
	public void setup() {
		frame.setTitle("Grow A Garden");
		frame.add(panel);
		frame.setVisible(true);
		panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener((KeyListener) panel);

	}	









	public static void main(String[] args) {
		GrowAGarden game = new GrowAGarden();
		game.setup();

	}

 
}
