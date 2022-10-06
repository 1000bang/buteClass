package builderEx;

public class MainTest1 {

	public static void main(String[] args) {

		// private이라 못함
		// Student student = new Student();

		// 내부클래스 호출, 세터 호출, 빌드메서드 호출

		Student 홍길동 = new Student.Builder().setName("홍길동").build();
		Student student = new Student.Builder().setGrade(1).build();

		System.out.println(홍길동);

		Student 이순신 = new Student.Builder().setGrade(3).setName("이순신").build();
		System.out.println(이순신);
	}

	
	
	//디자인패턴은 3가지 상황에만 쓴다
	
	//객체를 생성할 때
	// 구조패턴  구조가 많아서 줄이기 위함
	// 행위 패턴 (템플릿 메서드 패턴) 동작을 미리 정해줌
	
	
}
