package ch06;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Lolchess2 extends JFrame {
	JLabel map;
	JLabel champion;
	BufferedImage map1;
	BufferedImage cham1;
	MyImagePanel myImagePanel;
	
	//정적 내부클래스
 class MyImagePanel extends JPanel{
		
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.drawImage(map1, 0, 0, 500, 500, null);
			g.drawImage(cham1, 0, 0, 100, 100, null);
		}
	}
	
	MouseListener mouseListener = new MouseListener() {

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	@Override public void mouseClicked(MouseEvent e){champion.setLocation(e.getX(),e.getY());

	}};

	public Lolchess2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(600, 550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		map = new JLabel(new ImageIcon("background.png"));
		champion = new JLabel(new ImageIcon("player2.png"));
		try {
			map1 = ImageIO.read(new File("background.png"));
			cham1 = ImageIO.read(new File("palyer2.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myImagePanel = new MyImagePanel();
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		
		myImagePanel.setSize(500,500);
		myImagePanel.setLocation(0,0);
		add(myImagePanel);
		

//		map.setLocation(0, 0);
//		champion.setLocation(0, 0);
//		map.setSize(600, 550);
		champion.setSize(50, 50);
		champion.setLocation(100,100);
//		myImagePanel.add(champion);

	}

	private void addEventListener() {
		this.addMouseListener(mouseListener);
	}
		
	public static void main(String[] args) {
		new Lolchess2();
	}
}
