package threadex.ch02;

public class MainTest {
//인터페이스를 활용해서 thread 생성 및 사용방법
	
	public static void main(String[] args) {
	
		MyFrame1 myFrame1 = new MyFrame1();
		//myFrame1.run();
		//run은 동시실행이 안됨
		//방법?
		//thread
		Thread t1 = new Thread(myFrame1);
		t1.start();
		
		Thread t2 = new Thread(myFrame1);
		t2.start();		
	}
}
