package interfaces2;

public class ToyRobot implements RemoteController, SoundEffect {

	String name;

	public ToyRobot() {
		this.name = "마징가Z";
	}

	public void turnOn() {
		System.out.println("장난감 로봇을 켭니다.");
	}

	public void turnOff() {
		System.out.println("장난감 로봇을 끕니다.");
	}
	// 인터페이스 - 기능중심 설계

	@Override
	public void sound() {
		System.out.println("두두두두");

	}

}
