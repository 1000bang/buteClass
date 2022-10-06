package ch04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyEventListener1 extends JFrame implements ActionListener {

	JButton button1;
	JButton button2;
	JLabel label;

	public MyEventListener1() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		label = new JLabel("label");

	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		button1.setSize(100, 100);
		button1.setLocation(50, 50);
		button2.setSize(100, 100);
		button2.setLocation(200, 200);

		add(button1);
		add(button2);
		add(label);
	}

	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);

		// label.addA
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("버튼이 눌러졌습니다.");
		System.out.println(e.toString());
	}

}
