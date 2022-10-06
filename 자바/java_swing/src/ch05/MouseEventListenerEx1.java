package ch05;

import java.awt.Rectangle;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import org.w3c.dom.events.MouseEvent;

public class MouseEventListenerEx1 extends JFrame implements MouseListener {

	JLabel label;
	final int LABEL_WIDTH = 100;
	final int LABEL_HEIGHT = 100;
	int xPosition = 100;
	int yPosition = 100;

	public MouseEventListenerEx1() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("Hello Java");

	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
//		label.setSize(50, 50);
//		label.setLocation(100, 100);
		label.setBounds(xPosition, yPosition, LABEL_WIDTH, LABEL_HEIGHT);
		add(label);
		System.out.println("bounds : " + label.getBounds());
	}

	private void addEventListener() {

		this.addMouseListener(this);
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		System.out.println("click되었습니다.");
		//System.out.println(e.toString());
		
		Rectangle r = label.getBounds();
		//r.getWidth();
		//r.getHeight(); 을 이용할 수 있음 
		label.setLocation(e.getX()- LABEL_WIDTH, e.getY()-LABEL_HEIGHT);
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
	

	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
	

	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
	

	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
	
	}

}
