package ch17;

public class ToyMachine {

	// 사자인형, 곰인형, 권총, 에어팟 
	//버튼을 눌렀을 때 렌덤함수선언해서 뭐가 뽑혔습니다.

	Gift[] gift ;
	
	public void start() {
		System.out.println("작동합니다.");
	}
	public void pick() {
		System.out.println( "가 뽑혔습니다.");
	}
	public void finish() {
		System.out.println("경품뽑기가 종료됩니다.");
	}
	
	final void run() {
		start();
		pick();
		finish();
	}
	
	
}
