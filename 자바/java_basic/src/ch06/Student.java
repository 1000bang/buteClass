package ch06;

//함수와 메서드의 차이점???
// 메서드는 객체의 멤버 변수를 활용해서 동작을 완성한다.


public class Student {
	
	//상태(속성, 필드값)
	public int studentId;
	public String studentName;
	public String address;
	//참조타입 (대문자 데이터타입) 초기화 하지 않으면 기본값은 null이다 .
	
	
	//행위(기능)
	//메서드 
	//메서드는 멤버변수를 활용한다
	public void study() {
		System.out.println(studentName +"학생이 공부를 합니다.");
	}
	public void breakTime() {
		System.out.println(studentName + "학생이 휴식을 합니다.");
	}
	public void cleanup() {
		System.out.println(studentId + "학생이 청소를 합니다.");
	}
	
	
	public void showStudentInfo() {
		System.out.println("학생의 번호 : " + studentId);
		System.out.println("학생의 이름 : " + studentName);
		System.out.println("학생의 주소 : " + address);
	}
}
