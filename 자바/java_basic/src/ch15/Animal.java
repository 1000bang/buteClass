package ch15;

//추상 클래스 
//abstract : 강제성 
public abstract class Animal{
	String name;
	public void move() {
		System.out.println("동물이 움직입니다.");
	}

	public void eating() {
	}

	public abstract void hunt();
	//public abstract void hunt(){}  X    바디 없음 선언부만 있음
	
} // end of animal class
