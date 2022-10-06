package ch05;

public class MainTest1 {

	//메인 함수 코드의 시작점
	public static void main(String[] args) {
		System.out.println("프로그램을 시작합니다");
		int num1;  // 변수의 선언
		int num2 =10; //변수 선언과 초기화

		Student s1 = new Student();  
		// dot(.)연산자 : 객체안으로 들어간다라는 뜻
		s1.name = "김길동";
		s1.height = 170; 
		s1.weight = 80.0;
		System.out.println("-------");
		System.out.println(s1.name);
		System.out.println(s1.height);
		System.out.println(s1.weight);
		
		
		
		Student s2  ;  //student 데이터 타입에 s2라는 변수 선언 
		
		System.out.println(num2);
		System.out.println(s1);
		
		
		//변수의 종류
		//1. 기본 데이터타입
		//2. 참조 타입 (주소값)
		
		//컴파일시점(문법 검사)
		// sysout(num2);
		//런타입 시점(실행 버튼을 눌렀을 때
		
		//실행을 시키면
		//stack이라는 메모리영역에 공간할당
		//기본데이터타입은 stack에 저장
		// 참조타입은 heap에 저장
		
		
//		???????? 참조타입은 stack에 주소값을 저장 / heap 에 데이터를 저장 
		
		
		//new를 만나면 heap이라는 영역에 공간을 할당함
		//주소값은 동적메모리영역 (heap)에 저장됨 
	
		
		
		System.out.println(s1.name);
		System.out.println(s1.height);
		System.out.println(s1.weight);
		
		
		
		// dot(.)연산자 : 객체안으로 들어간다라는 뜻
		s1.name = "김길동";
		s1.height = 170; 
		s1.weight = 80.0;
		System.out.println("-------");
		System.out.println(s1.name);
		System.out.println(s1.height);
		System.out.println(s1.weight);
		
//		System.out.println(s1.name);
//		System.out.println(s1.height);
//		System.out.println(s1.weight);
//		
//		//참조 타입에 값을 할당하는 방법
//		//s1에 접근 해 네임에 이순신이라고 입력
//		// 참조타입 s1에 값을 화면에 출력하는 방법
//		s2.name = "이순신";
//		s2.height = 190;
//		s2.weight = 100.5;
//		System.out.println("-------");
//		System.out.println(s2.name);
//		System.out.println(s2 .height);
//		System.out.println(s2.weight);
//		System.out.println(s1.name);
//		System.out.println(s1.height);
//		System.out.println(s1.weight);
//		// heap 안에 s1데이터 s2데이터 따로 들어가는것을 확인할 수 있음
//		
		
		
		
		
	}

}
