package ch05;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MyFrame6 extends JFrame {

	public MyFrame6() {
		initData();
		setInitLayout();
		addEventListener();

	}

	private void initData() {
		setTitle("adapterclass 이용");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void setInitLayout() {
		setVisible(true);
		// 리사이즈가 안되게 하는 방법 boolean
		setResizable(false);
	}

	private void addEventListener() {
		// 추상메서드 5개 (불필요한 코드가 많아서 가독성이 떨어진다.
		this.addMouseListener(new MyMouseListener());
	}

	// 내부클래스 생성
	private class MyMouseListener extends MouseAdapter {
		// 사용하고 싶은 기능만 재정의 가능하다.
		@Override
		public void mouseClicked(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			System.out.println("x : " + x);
			System.out.println("y : " + y);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println("마우스 포커스가 프레임 안으로 들어왔습니다.");
		}

	}// end of inner class

}
