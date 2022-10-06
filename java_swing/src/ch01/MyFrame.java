package ch01;

import javax.swing.JFrame;

// 자바개발자들이 미리 만들어 놓은 클래스를 상속받음
public class MyFrame extends JFrame {

	// 인스턴스화 될때 가장먼저 실행되는 코드 - 생성자!
	public MyFrame() {
		// 부모에 접근해 . 셋타이틀을 가져온다
		super.setTitle("MyFrame1");
		// public void setSize(int width, int height) width가로 height 세로
		super.setSize(800, 500);
		super.setVisible(true);
		//gui를 닫으면 프로그램 종료시키는 
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
