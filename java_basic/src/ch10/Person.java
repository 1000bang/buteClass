package ch10;

public class Person {

	//this란
	// 인스턴스(객체) 자신의 메모리를 가리킨다.
	// 생성자에서 또다른 생성자를 호출 할 때 사용할 수 있다
	// 자신의 주소(참조값, 주소값) 반환시킬수 있다
	
	String name;
	int age;
	int phone;
	String gender;
	
	// 자신의 메모리를 가리키는 this
	public Person(String name, int age) {
		this.name = name;
		this.age = age ;
		System.out.println("사용자 정의 생성자 기능을 종료합니다.");
	}
	public Person(String name, int age, int phone) {
		//this(); 를 하면 기본으로
		this(name, age);
		this.phone = phone;
	}
	
	public Person(String name, int age, int phone, String gender) {
		//this(); 를 하면 기본으로
		this(name, age, phone);
		this.gender = gender;
		
	}
	
	
	public Person() {
		//기본값 가지게 하기
//		this.name = "아무개";
//		this.age = 1;
		//생성자에서 또다른 생성자를 호출할 때 this사용
		this("아무개", 1);
		System.out.println("기본생성자 기능을 종료합니다.");
	}
	
// 참조타입?	
//	public int yes() {
//		return age;
//	}
	
	//디자인 패턴:
	//this 빌더패턴 개념 이해할 수 있다.
	
	//return type 이 person
	
	public Person getPerson() {
		// 자기 자신의 주소값 반환 시킬 수 있다. 
		//new Person(); 주소값 반환 
		//return new Person();
		return this;
		
	}
	
	
	
	
	
	
	
	
	public void showinfo() {
		System.out.println("이름 : " + name + "나이 : " + age);
		//System.out.println("이름 : " + this.name + "나이 : " + this.age); 쓸거면 다쓰고 안쓸거면 다 안쓰고
		
	}
	
	//잠시 자리를 빌려서 사용할 수 있다 함수는 
	// 왜? 자바문법임
	public static void main(String[] args) {
		Person person1 = new Person();
		//코드의 흐름상 위에서 부터 내려옴
		
	}
	
	
	
}
