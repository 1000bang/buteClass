package ch06;

public class MainTest1 {

	public static void main(String[] args) {
		//Student stduentKim ;   메모리에 올라감? x stack에 공간 할당만 
	
		//객체 :  메모리에 올라 갔을 때 객체라고한다 인스턴트화
		Student studentKim = new Student(); //객체
		studentKim.studentName = "홍길동";
		studentKim.studentId = 1;
		studentKim.address = "부산진구";
		
		//기능 2개
		studentKim.showStudentInfo();
		studentKim.study();
		
		System.out.println("-------------");
		Student studentlee = new Student(); 
		studentlee.studentName = "이순신";
		studentlee.studentId = 2;
		studentlee.address = "부산해운대";
		
		studentlee.showStudentInfo();
		
		
		//kim 의 변수_이름에 접근해서 화면에 결과를 출력해주세요
		System.out.println("-------------");
		System.out.println(studentKim.studentName);
		System.out.println(studentlee.studentName);
		
		studentKim.showStudentInfo();
		
		
		studentKim.study();
		studentlee.study();
		
		
		studentlee.breakTime();
		studentlee.cleanup();
		
	}

}
