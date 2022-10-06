package interfaces;

import interfaces2.RemoteController;
//냉장고 클래스는 리모트컨트롤러를 구현했다. 
//냉장고클래스는 홈어플라이언스로 바라볼 수 있고 리모트컨트롤러로 볼 수 도 있다. 다형성
public class Refrigerator extends HomeAppliances implements RemoteController {

	@Override
	public void turnOn() {
		System.out.println("냉장고를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("냉장고를 끕니다");
		
	}

}