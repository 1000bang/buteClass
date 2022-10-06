package superMario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class BackGround extends JFrame implements ActionListener, KeyListener {

	BufferedImage backgoundImage;
	BufferedImage mario;
	BufferedImage coin;
	BufferedImage enemy;

	public BackGround() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(800, 300);
		setTitle("Super마리오");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(false);

	}

	private void addEventListener() {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new BackGround();
	}

}
