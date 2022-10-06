package ch03_1;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame2 extends JFrame {

	MyDrawPanel drawPanel;

	public MyFrame2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("paint practice");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel = new MyDrawPanel();
	}

	private void setInitLayout() {

		setVisible(true);
		add(drawPanel);
	}

	// 인스턴스 내부 클래스
	// 내부클래스에서 접근제어 지시자 설정(레벨링)할 수 있다.
	// static 추가하게 되면 정적 내부클래스라고 한다.
	public static class MyDrawPanel extends JPanel {

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawString("집", 112, 575);
			g.drawRect(50, 50, 10, 10);

		}

	} // end of MyDrawPanel

}// end of MyFrame2 class

public class PaintMainTest {

	public static void main(String[] args) {
		// 실무에선 거의 안쓰지만 문법이 있다는건 알아두자

		MyFrame2 frame2 = new MyFrame2();
		// -----------인스턴스 내부클래스 사용하는 방법
		// 1. 데이터타입을 선언
		// 외부클래스 이름으로 접근하고, 연산자 후에 내부 클래스 데이터 타입을 선언하고 변수명을 지정

		// 2. 초기화 하는 방법
		// 외부클래스가 생성되어 있고 참조 변수로 접근해서 new 내부클래스(); 로 메모리에 올릴 수 있다.
		// MyFrame2.MyDrawPanel myPanel = frame2.new MyDrawPanel();

		// ------------정적 내부클래스 사용하는 방법
		MyFrame2.MyDrawPanel staticMyPanel = new MyFrame2.MyDrawPanel();

	}

}
