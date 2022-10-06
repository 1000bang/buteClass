package interfaces2;

public class Television extends HomeAppliances implements RemoteController {

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

	// int size 사이즈는 width, height 을 가지고 있는 클래스로 만들어주는게 좋다

}
