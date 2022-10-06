package computer;

//abstract class 선언
public abstract class Computer {

	// abstract 메서드 선언
	public abstract String display();

	public abstract String typing();

	// 일반 메서드 선언
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다");
	}
}
