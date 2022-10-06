package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame {
//포함관계 
	//버튼 생성하기
	JButton button1;

	public FlowLayoutEx() {
		setTitle("버튼배치해보기");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		// 여기까지가 기본 명령어

		button1 = new JButton("button 1");
		add(button1);

	}

	// 코드의 시작점
	public static void main(String[] args) {
		new FlowLayoutEx();

	}// end of main

}
