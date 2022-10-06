package test.ex01;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Movable {

	private int x;
	private int y;

	private ImageIcon playerR, playerL;

	public Player() {
		initData();
		setInitLayout();

	}

	private void initData() {
		playerR = new ImageIcon("image/playerR.png");
		playerL = new ImageIcon("image/playerL.png");

	}

	private void setInitLayout() {
		x = 55;
		y = 535;
		setIcon(playerR); // setIcon : Defines the icon this component will display
		setLocation(x, y);
		setSize(50, 50);

	}

	@Override
	public void left() {
		setIcon(playerL);
		x -= 10;
		setLocation(x, y);

	}

	@Override
	public void right() {
		setIcon(playerR);
		x += 10;
		setLocation(x, y);
	}

	@Override
	public void up() {
		System.out.println("jump");
	}

	@Override
	public void down() {
		System.out.println("fall");
	}

}
