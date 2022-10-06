package ch04;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame2 extends JFrame implements ActionListener {

	JButton button1;
	JButton button2;
	JPanel jpanel;
	

	public MyFrame2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		jpanel = new JPanel();
		
	}

	private void setInitLayout() {
		setVisible(true);
		//setLayout(new FlowLayout());
		add(jpanel);
		jpanel.add(button1);
		jpanel.add(button2);
	
	}

	private void addEventListener() {
		// 등록을 해줘야한다
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	// 재정의 해야함
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//만약 e라는 녀석의 주체가 넘어온다면 현재 객체와 같은지 확인을 한다.
		//System.out.println(e.getSource());
		//다운 캐스팅 
		JButton targetButton = (JButton)e.getSource();
		//System.out.println(targetButton.getText());		
		if(targetButton.getText().equals(button1.getText())) {
			System.out.println("button1이 눌러졌습니다.");
			jpanel.setBackground(Color.cyan);
		}else {
			System.out.println("button2가 눌러졌습니다.");
			jpanel.setBackground(Color.white);
		}
		
		// 콜백메서드
	}

}

public class EventListenerEx1 {

	public static void main(String[] args) {
		new MyFrame2();

	}
}
