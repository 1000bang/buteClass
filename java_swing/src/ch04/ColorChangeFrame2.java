package ch04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChangeFrame2 extends JFrame {

	JButton button1;
	JButton button2;
	JButton button3;

	public ColorChangeFrame2() {
		initData();
		setInitLayout();
		addEventListener();

	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("보튼1");
		button2 = new JButton("보튼2");
		button3 = new JButton("보튼3");

	}

	private void setInitLayout() {
		setVisible(true);
		this.setLayout(new FlowLayout());
		add(button1);
		add(button2);
		add(button3);

	}

	private void addEventListener() {

//		ActionListener temp = new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		};

		// 익명 구현클래스
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 눌러졌습니다.");

			}
		});

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼2이 눌러졌습니다.");

			}
		});

		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("button3");
			}
		});

	}
	// 추상클래스나 인터페이스도 구현클래스로 만들어서 new키워드를 사용할 수 있다.
	// 단 추상 메서드가 있으면 일반 메서드로 구현해야한다. (강제)

	public static void main(String[] args) {
		// 익명 클래스
		new ColorChangeFrame2();

		// mycolor
		// ColorChangeFrame2 mycolor = new ColorChangeFrame2();
	}

}