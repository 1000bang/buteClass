package ch07; //1

public class Student {

	//생성자 - constructor 
	// 객체가 생성할 때 다음과 같은 모양으로 만들어라고 지시하는 것
	// 객체를 생성할 때 강제성을 부여하는 것. 
	//  = 내가 만든 객체를 쓰고 싶으면 내가 만든 생성자의 모양대로 만들어라
	
	//객체가 생성될 때 반드시 생성자가 있어야 한다. 
	// 개발자가 생성자를 직접 정의하지 않으면 컴파일러가 알아서 자동으로 
	// 생성자를 만들어 넣고 컴파일 시킨다. 
	public Student() {
		
	}
	int number;
	String name;
	int grade;
	
	//생성자 오버로딩 
	
	public Student (int n, String a, int c) {
		//수행문;
		number = n;
		name = a;
		grade = c;
	}
	
	
	//사용자 정의 생성자
	//생성자 정의하기 (개발자가 직접 정의)
		//생성자 만드는 규칙
		//1. 반환값이 없다
		//2. 클래스명과 동일
		//3. 대문자로 시작
		//4. 매개변수는 넣을 수 있음
	
	

	public String showInfo() {
		return grade+"학년 " +name + " 학생의 번호는 : " + number + "입니다."; 
	//메모리에 올라갈 때 가장 먼저 동작하는건 생성자이다.
	} //end of class
	
	
	
	
}
