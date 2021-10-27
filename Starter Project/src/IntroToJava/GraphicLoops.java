// filler code for pong provided by Mr. David

package IntroToJava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicLoops extends JPanel {
	
	// constants that are predefined and won't change as the program runs
	private final int WIDTH = 1000, HEIGHT = 1000;

	// defines what we want to happen anytime we draw the graphics
	public void paint(Graphics g) {
		
		// background color is gray
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		circles(g,6);
		smallToBig(g);
		circleTen(g);
		checkerboard(g);
		colorChange(g);
		sequence(g);		
	}
	
	public void circles(Graphics g,int num){
		g.setColor(new Color(3,3,3));
		for (int i=0; i<num; i++) {
			g.fillOval(i*50, 20, 50, 50);
		}
	}
	
	public void smallToBig(Graphics g) {
		for (int i=1, r = 10; i<=10; i++) {
			g.setColor(new Color(200,150,3));
			g.fillOval(i*50, 150, r, r);
			if (i>5) {
				r-=5;
			}
			else {
				r+=5;
			}
		}
	}
	
	public void circleTen(Graphics g) {
		
		int circleDiam = 20;
		int circleX = 300;
		int circleY = 300;
		for(int i = 0; i<10; i++) {
			circleX+=circleDiam;
			circleY=200;
			for(int j = 0; j<10; j++) {
				circleY+= circleDiam;
			g.setColor(new Color(100,45,250));
			g.drawOval(circleX, circleY, circleDiam, circleDiam);
		}}
		
	}

	public void checkerboard(Graphics g) {
		for (int i=1;i<=9;i++) {
			g.setColor(new Color(0,0,0));
			g.fillRect(i*30,300,5,240);
		}
		for (int i=1;i<=9;i++) {
			g.setColor(new Color(0,0,0));
			g.fillRect(30,270+i*30,245,5);
		}
	}
	
	public void colorChange(Graphics g) {
		for (int i=1, R = 10, B = 250; i<=10; i++, R+=25, B-=15) {
			g.setColor(new Color(R,150,B));
			g.fillRect(i*50, 600, 25, 25);
		}
	}
	
	public void sequence(Graphics g) {
		for (int i=0; i<WIDTH; i+=90) {
			g.setColor(new Color(255,105,180));
			g.fillOval(i, 750, 25, 25);
			g.fillRect(i+30, 750, 25, 25);
			g.drawLine(i+75,750,i+60,775);
			g.drawLine(i+75,750,i+90,775);
			g.drawLine(i+60,775,i+90,775);
		}
	}
		
	
	
	

	//////////////////////////////////////
	//////////////////////////////////////
	
	// DON'T TOUCH THE BELOW CODE
	
	
	// this method runs the actual program.
	public void run() {

		// while(true) should rarely be used to avoid infinite loops, but here it is ok because
		// closing the graphics window will end the program
		while (true) {
	
			// draws
			//repaint();
			
			//rests for a hundredth of a second
			try {
				Thread.sleep(10);
			} catch (Exception ex) {}
		}
	}
	
	// very simple main method to get the game going
	public static void main(String[] args) {
		new GraphicLoops();
//		GraphicLoops runner = new GraphicLoops();
//		runner.circles();
		
	}
 
	// does complicated stuff to initialize the graphics and key listeners
	// DO NOT CHANGE THIS CODE UNLESS YOU ARE EXPERIENCED WITH JAVA
	// GRAPHICS!
	public GraphicLoops() {
		JFrame frame = new JFrame();
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		this.setFocusable(true);
		
		run();
	}
}