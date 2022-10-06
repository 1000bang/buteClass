package ch03;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame1 extends JFrame {

	ImagePanel imagePanel;

	public MyFrame1() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("JPanel에 이미지 넣기");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		imagePanel = new ImagePanel();

	}

	private void setInitLayout() {
		setVisible(true);
		add(imagePanel);
	}

	// inner class
	class ImagePanel extends JPanel {

		private Image image;

		public ImagePanel() {
			// 루트 경로가 프로젝트 기반임 (이미지를 프로젝트에 넣어야함)
			// 메서드 체인 
			image = new ImageIcon("abc.jpg").getImage();
		}

		// 그림을 그려주는 기능
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(image, 0, 0, 400, 400, null);

		}

	}// end of inner class
} // end of Myframe

public class MainTest1 {

	public static void main(String[] args) {
		new MyFrame1();
	}

}
