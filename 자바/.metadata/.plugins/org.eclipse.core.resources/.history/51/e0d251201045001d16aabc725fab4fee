package ch18;

//모든 클래스의 최상위 클래스는 object클래스이다. 
//자바에서는 extends키워드를 단 한번만 사용할 수 있다.
//자바에서는 다중상속을 지원하지않는다 모호성이 발생하기 때문에
// 단 최상위클래스인 object클래스는 예외로 한다.
//모든클래스는 object클래스를 상속받는다.
public class Student {



	private int studentId;
	private String studentName;
	
	//문제 1 
	//toString 매서드를 재정의 하세요
	// 학번 + id 이름 +  name
	
	@Override
	public String toString() {

		return "학번 : " + studentId + "이름 : " + studentName;
	}
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	//문제 2
	//equals 메서드를 재정의하세요
	//조건은 학생의 이름고 ㅏ학생의 id값이 같으면 같은학생입니
	@Override
	public boolean equals(Object obj) {
	if (obj instanceof Student) {
		Student tempStudent =(Student)obj;
		if (this.studentId == tempStudent.studentId && this.studentName == tempStudent.studentName) {
			return true;
		}
	}
	return false;
	}
	}
