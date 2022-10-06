package ch16;

public abstract class Car {
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}

	public abstract void drive();

	public abstract void stop();

	public abstract void wiper();

	// 후크 메서드 필요하다면 재정의해서 써
	public void washCar() {}

	void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	// final - 상수(변수앞에)
	// final - 메서드(메서드앞에)
	// 사용하는 이유 : 하위클래스에서 재정의 할 수 없게 만든다.
	// 실행의 흐름이 정해져있을 때

	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
