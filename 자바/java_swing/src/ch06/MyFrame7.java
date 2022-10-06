package ch06;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame7 extends JFrame implements KeyListener {

	private JTextArea area;

	public MyFrame7() {
		initData();
		setInitLayout();
		addEventListener();

	}

	private void initData() {
		setTitle("keyboard event 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();
	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		add(area);
	}

	private void addEventListener() {
		area.addKeyListener(this);
	}

	// 키를 타입했을 때 호출 문자키에만 반응
	@Override
	public void keyTyped(KeyEvent e) {

	}

	//
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("key code : " + e.getKeyCode());

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
