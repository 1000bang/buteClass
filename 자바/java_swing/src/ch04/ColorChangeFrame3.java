package ch04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChangeFrame3 extends JFrame {

	JButton button1;
	JButton button2;
	JButton button3;

	ActionListener listener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button1) {
				System.out.println("버튼 1");
	
			} else {
				System.out.println("버튼2");

			}

		}

	};

	public ColorChangeFrame3() {
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
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		
	}

	public static void main(String[] args) {
		// 익명 클래스
		new ColorChangeFrame3();

		// mycolor
		// ColorChangeFrame2 mycolor = new ColorChangeFrame2();
	}

}