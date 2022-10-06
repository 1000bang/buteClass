package ch10;
//3
//static 사용
//은행가서 번호표 뽑는 class
public class NumberPrinter {

	private static int waitNumber  	;  //static을 붙이는 순간 힙영역에서 static메모리영역으로 이동 
														// static은 태양이다? 모두가 공유할 수 있는 영역, 
	private int id;
	
	
	public NumberPrinter(int id) {
		this.id = id;
		this.waitNumber = 1; //기본값 설정
	}	//end of NumberPrinter 생성자
	
	
	//번호표를 출력하는 기능
	public void printWaitNumber() {
		System.out.println(id + "기기의 대기순번 " + waitNumber);
		waitNumber ++;
	}  // end of printWaitNumber 메서드
	
	//Main 함수 동작실행
	public static void main(String[] args) {
		NumberPrinter numberPrinter1 = new NumberPrinter(1);
		NumberPrinter numberPrinter2 = new NumberPrinter(2);
	//왼쪽 기계	
		numberPrinter1.printWaitNumber();
		numberPrinter2.printWaitNumber();
		numberPrinter1.printWaitNumber();
	
	}
	
	
	
	
}
