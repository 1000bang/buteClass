package threadex.ch02;

import javax.swing.JFrame;

// sub작업자를 만드는 두번째 방법(인터페이스 활용)
public class MyFrame1 extends JFrame implements Runnable {

	@Override
	public void run() {
		// 병렬 처리 코드를 넣어주면 된다.
		for (int i = 0; i < 10; i++) {
			System.out.println("i : " + i + " \t");
		}
	}

}
