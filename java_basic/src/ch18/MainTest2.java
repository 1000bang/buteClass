package ch18;

public class MainTest2 {

	public static void main(String[] args) {
		Student student1 = new Student(1, "티모");
		Student student2 = new Student(2, "야소");
		Student student3 = new Student(1, "티모");
		Student student4 = new Student(3, "티모");

		// == 메모리에 올라가 있는 주소값을 비교한다
		// 물리적인 확인(주소값)
		if (student1 == student3) {
			System.out.println("같은학생");
		} else {
			System.out.println("다른학생");
		}

		System.out.println("---------");
		// 논리적인 확인(우리가 판단 근거로하는 데이터로)
		if (student1.equals(student3)) {
			System.out.println("같은놈");
		} else {
			System.out.println("다른놈");
		}

	}

}
