package threadex.ch02;

public class MainTest2 {
// 2 : 익명 구현 클래스 활용 방법
	public static void main(String[] args) {
	
		MyFrame2 myFrame2 = new MyFrame2();
		
		Thread thread = new Thread(myFrame2.runnable);
		thread.start();
		
		//myFrame2.runnable.run();
	
	}

}
