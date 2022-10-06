package ch04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


//얘가 마이프레임 1
class MyFrame1 extends JFrame implements ActionListener {

	JButton button;

	public MyFrame1() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("button");
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		add(button);
	}

	private void addEventListener() {
		// 등록을 해줘야한다
		button.addActionListener(this);
	}

	// 재정의 해야함
	@Override
	public void actionPerformed(ActionEvent e) {
		// 콜백메서드
		System.out.println("버튼이 눌러졌습니다!!!");
		System.out.println(e.toString());
	}

}

public class EventListenerEx2 {

	public static void main(String[] args) {
		new MyFrame1();

	}
}
