package ch15;

public class MainTest1 {
	public static void main(String[] args) {
		//추상 클래스는 메모리화 할 수 없는 강제성을 가진다.
		//추상클래스는 new라는 키워드를 활용해서 생성할 수 없게 막는다.
		//Animal animal = new Animal();
		//Animal animal = new Tiger();
		Animal pAnimal = new Person();
		pAnimal.name= "홍길동";
		pAnimal.move();
		pAnimal.hunt();
		System.out.println(pAnimal.name);
	
	}
}
