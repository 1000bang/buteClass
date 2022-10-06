package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

//내부클래스
class MyDrawPanel extends JPanel {

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("집", 112, 575);
		g.drawString("o", 330, 650);
		// 연기
		g.drawString("○", 450, 250);
		g.drawString("O", 440, 260);
		g.drawString("o", 420, 280);
		g.drawString("o", 430, 270);
		g.drawLine(330, 250, 150, 450);
		// 오른쪽지붕
		g.drawLine(330, 250, 400, 320);
		g.drawLine(430, 350, 530, 450);

		g.drawLine(150, 450, 530, 450);
		g.drawLine(120, 550, 120, 560);
		// 담벼락
		g.drawRect(530, 500, 500, 300);
		g.drawRect(0, 500, 150, 300);
		// 본체
		g.drawRect(220, 450, 250, 250);
		// 문
		g.drawRect(320, 600, 50, 100);
		// 명패
		g.drawRect(110, 560, 20, 50);
		// 굴뚝
		g.drawRect(400, 300, 30, 70);
		// 창문
		g.drawRect(400, 500, 70, 50);
		// 창문틀
		g.drawRect(395, 495, 75, 62);

	}

} // end of MyDrawPanel

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

}// end of MyFrame2 class

public class PaintMainTest {

	public static void main(String[] args) {
		new MyFrame2();
	}

}
