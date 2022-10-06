package ch13;

public class Cal {

	public int sum(int n1, int n2) {
		return n1 + n2;
	}

	public int multiply(int n1, int n2) {
		System.out.println("cal 메서드 ");
		return n1 * n2;
	}

} // end of class

class Cal2 extends Cal {

	public int minus(int n1, int n2) {
		return n1 - n2;

	}

	// 오버 라이드 (!= 오버로딩) 부모 메서드의 이름,매개변수를 재정의 한다.
	// 부모클래스에 이름이 같은 메서드가 있으면
	// 부모클래스의 메서드를 잠시 지워놓고 자식클래스의 메서드를 활용함
	// 기능을 확장할 때 쓰임

	// 어노테이션 : 주석 + 힌트
	@Override // 어노테이션 부모클래스에 multiply라는 메서드가 있는지 확인해
	public int multiply(int n1, int n2) {
		if (n1 == 0 || n2 == 0) {
			System.out.println("0을 대입할 수 없습니다. ");
		}
		return super.multiply(n1, n2); // 부모클래스에 가서 multiply라는 메서드를 호출해라
										// 부모클래스의 multiply 안에 입력된 데이터들을 활용할 수 있다
	}


//	public int multiply(int n1, int n2) {
//
//		if (n1 == 0 || n2 == 0 ) {
//			System.out.println("0을 대입할 수 없습니다. ");
//		}
//		return n1 * n2;
//	}

}