package ch10;

//3
//static 사용
//은행가서 번호표 뽑는 class
public class NumberPrinter2 {

	public static int waitNumber;
	public int id;

	public NumberPrinter2(int id) {
		this.id = id;
		this.waitNumber = 1;
	}

	// static 메서드 안에서는 멤버 변수를 활용할 수 없다.
	// 객체가 메모리에 올라 갔다고 보장할 수 없음
	public static int getWaitNumber() {
		// id = 100;
		return waitNumber;
	}

	// 번호표를 출력하는 기능
	public void printWaitNumber() {
		System.out.println(id + "기기의 대기순번 " + waitNumber);
		waitNumber++;
	} // end of printWaitNumber 메서드

}
