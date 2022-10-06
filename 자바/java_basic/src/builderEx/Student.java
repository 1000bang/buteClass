package builderEx;

//빌더 패턴의 이해 !!
public class Student {

	private String name;
	private int grade;

	// 객체를 생성할 때 실수를 줄이고 편하게 쓰기위함
	// 생성자 매개변수에서

	// 빌더패턴 만드는 방법
	// 1. 기본생성자를 private으로 정의해서 만들어 준다.

	
	private Student() {

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}

	// 2. 내부클래스 생성
	// instance, static 둘다 가능
	// 내부클래스 이름은 마음대로 설정가능 보통 builder라고 많이 씀
	public static class Builder {
		
		//외부클래스에 있는 변수들을 내부클래스의 변수로 선언해 준다.
		private String name;
		private int grade;

		// 3. 내부클래스를 리턴하는 메서드를 만들어 준다.
		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setGrade(int grade) {
			this.grade = grade;
			return this;
		}

		//빌더패턴의 핵심코드 !!
		public Student build() {
			Student student = new Student();
			student.name = this.name; // this -> builder 의 name
			student.grade = this.grade; 
			return student;
		}
		
		
	}

}// end of class
