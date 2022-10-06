package ch15;

//추상클래스를 상속 받을 수 있다.
//하지만 추상메서드(부모)가 존재한다면
//1. 자식(human)클래스도 추상클래스로 선언하면 된다. 
public abstract class Human extends Animal{

	//2. 추상메서드를 일반 메서드로 재구현 해주면 된다. 
	
//	 @Override
//	public void hunt() {
//	System.out.println("사람이 도끼로 사냥합니다");	
//	}
//	
}
