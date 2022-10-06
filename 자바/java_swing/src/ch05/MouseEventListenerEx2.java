package ch05;

import java.awt.Rectangle;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import org.w3c.dom.events.MouseEvent;

public class MouseEventListenerEx2 extends JFrame {

	JLabel label;
	final int LABEL_WIDTH = 100;
	final int LABEL_HEIGHT = 100;
	int xPosition = 100;
	int yPosition = 100;

	public MouseEventListenerEx2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("Hello Java");

	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
//		label.setSize(50, 50);
//		label.setLocation(100, 100);
		label.setBounds(xPosition, yPosition, LABEL_WIDTH, LABEL_HEIGHT);
		add(label);
		System.out.println("bounds : " + label.getBounds());
	}

	private void addEventListener() {

		this.addMouseListener(new MouseListener() {
			
			//마우스 눌렀다가 떨어졌을 때 실행되는 메서드
			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("11111");
			}
			//마우스가 눌러졌을 때 실행되는 메서드
			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("2222222");
			}
			
			// 마우스가 감지하고 있는 객체에서 나갔을 때 
			//프레임화면에서 나갔을 때  
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				System.out.println("33");
				
			}
			
			//마우스가 감지하고 있는 객체에 들어왔을 때 실행
			//프레임화면에 들어올 때
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
			System.out.println("4");
			}
			
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				System.out.println("55");
				label.setLocation(e.getX(), e.getY() -label.getBounds().height);
				
			}
		} );
	}

}
