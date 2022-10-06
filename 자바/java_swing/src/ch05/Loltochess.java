package ch05;

import java.awt.event.MouseAdapter;

import javax.swing.JFrame;



public class Loltochess extends JFrame implements Controller {

	public Loltochess() {

	}

	private void initData() {
		setTitle("LOLTOCHESS");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void setInit() {
		setVisible(true);
	}

	private void addEventListener() {
//		this.MyController(new ControllerAdapter());
	}

	private class MyController extends ControllerAdapter{
		
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
}
