package interfaces;

import interfaces2.RemoteController;

public class ToyRobot implements RemoteController {

	String name;

	@Override
	public void turnOn() {
		System.out.println("장난감 로봇을 켭니다");

	}

	@Override
	public void turnOff() {
		System.out.println("장난감 로봇을 끕니다");

	}

}
