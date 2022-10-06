package games;

import javax.swing.JPanel;

public class ThreadEX extends JPanel implements Runnable{
	MiniGame2 mini = new MiniGame2();
	
	@Override
	public void run() {
		boolean flag = true;
		while(flag) {
			mini.shotY -= 10;
			if (mini.shotY == 0) {
				mini.shot = null;
			}
		}
	}
	
}
