package ch10;

public class MainTest2 {

	public static void main(String[] args) {

		NumberPrinter2.waitNumber = 10;
// 	객체를 선언하지 않았는데 가능한 이유는
// 	프로그램 실행될 때 가장 먼저 뜨는 영역이  static이기 때문
// 	NumberPrinter2.id = 1;             -> static이 아니면 안됨
		System.out.println(NumberPrinter2.waitNumber);

		// 일반적 사용으로
		NumberPrinter2 printer2 = new NumberPrinter2(0);
		printer2.id = 1;
		System.out.println(printer2.id);

		NumberPrinter2.getWaitNumber();

	}

}
