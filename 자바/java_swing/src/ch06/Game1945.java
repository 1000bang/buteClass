package ch06;

import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game1945 extends JFrame {

	JLabel plane;
	JLabel background;
	JLabel shot;

	final int OWN_X = 500;
	final int OWN_Y = 680;
	final int RIGHT = 39;
	final int LEFT = 37;
	final int UP = 38;
	final int DOWN = 40;

	public Game1945() {
		initData();
		setInitLayout();
		addEventListener();

	}

	private void initData() {
		setTitle("1945");
		setSize(515, 718);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		plane = new JLabel(new ImageIcon("plane.png"));
		background = new JLabel(new ImageIcon("background2.png"));
		shot = new JLabel(new ImageIcon("shot.png"));
	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(true);
		setLayout(null);

		plane.setSize(180, 150);
		plane.setLocation(170, 500);
		
		shot.setSize(100,100);
		background.setSize(OWN_X, OWN_Y);
		
		add(plane);
	//
		add(background);
	}

	private void addEventListener() {
		// label에서는 plane.addkeylistener 안됨
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				controll(e);
			}

		});
	}

	private void controll(KeyEvent e) {

		int x = plane.getX();
		int y = plane.getY();
		int keyCode = e.getKeyCode();

//		if (x > OWN_X || y > OWN_Y || x < 0 || y < 0) {
//			plane.setLocation(x, y);

		if (keyCode == RIGHT) {
			plane.setLocation(x + 10, y);
			cantgo(e);
		} else if (keyCode == LEFT) {
			plane.setLocation(x - 10, y);
			cantgo(e);
		} else if (keyCode == UP) {
			plane.setLocation(x, y - 10);
			cantgo(e);
		} else if (keyCode == DOWN) {
			plane.setLocation(x, y + 10);
			cantgo(e);
		} else if (keyCode == 32) {	
			System.out.println("1");
			setLayout(null);
			shot.setLocation(x-150, y-150);
			add(shot);

		}
	}

	private void cantgo(KeyEvent e) {
		int x = plane.getX();
		int y = plane.getY();
		if (x > OWN_X - 150) {
			plane.setLocation(OWN_X - 150, y);
		}
		if (y > OWN_Y - 150) {
			plane.setLocation(x, OWN_Y - 150);
		}
		if (x < 0) {
			plane.setLocation(0, y);
		}
		if (y < 0) {
			plane.setLocation(x, 0);
		}
	}
}
