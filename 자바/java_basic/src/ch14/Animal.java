package ch14;

public class Animal {

	// 메서드

	public void move() {
		//System.out.println("동물이 움직입니다.");
	}

	public void eat() {
	}

} // end of animal class

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다. ");
		super.move();
	}

	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}

} // end of human class

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 걷습니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}// end of tiger class


class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다. ");
	}
}
