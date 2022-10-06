package ch16;

public class MainTest {
//main thread / start of main
	public static void main(String[] args) {

		Car aiCar = new AiCar(); // 업캐스팅, 다형성
		aiCar.run();
		System.out.println("==========");
		Car manualCar = new ManualCar();
		manualCar.run();
		// 실행의 흐름을 만드는 패턴 : 템플릿 메서드 패턴(final method)

	}// end of Main

}// end of class
