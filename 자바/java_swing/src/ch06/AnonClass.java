package ch06;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

//문제 1. 익명 구현 클래스로 변경해서 구현 : 주석
// 문제 2. adapter클래스

public class AnonClass extends JFrame {

	private JTextArea area;

	public AnonClass() {
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
		// 2. 어뎁터클래스

		area.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyCode());
				// area.setText("key code : " + e.getKeyCode());
				area.append("key code : " + e.getKeyCode() + "\n");
				displayKeyInfo(e);
			}
		});
	}

	private void displayKeyInfo(KeyEvent e) {
		e.getKeyCode();
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		String info = " c : " + c + "\t" + "keycode : " + keyCode;
		
		area.append(info + "\n");
	}

	// area.addKeyListener(new MyKeyboard());
//		
//	}	
//	//안에서 변수선언 후 이용해서 재정의 할 수 있음
//		private class MyKeyboard extends KeyAdapter {
//			@Override
//			public void keyTyped(KeyEvent e) {
//			System.out.println("dfkl");
//			}

	// 1. 익명구현클래스 !
//		area.addKeyListener(new KeyListener() {
//			
//			@Override
//			public void keyTyped(KeyEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void keyReleased(KeyEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void keyPressed(KeyEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
}
