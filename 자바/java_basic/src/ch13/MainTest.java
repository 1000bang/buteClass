package ch13;

public class MainTest {

	public static void main(String[] args) {
		// C가 A를 상속받았으니 A클래스의 생성자를 먼저 확인, 메모리에 올려 둠
		C c = new C("안녕", 100);
		c.num1 = 1;
		c.num2 = 2;
		c.num3 = 3;
		c.num4 = 4;
		c.num5 = 5;
		System.out.println(c.num1);
		System.out.println(c.num2);
		System.out.println(c.num3);
		System.out.println(c.num4);
		System.out.println(c.num5);
	} // end of main
}// end of class

// 선임개발자가 만든 A클래스임
class A {
	String name;
	int num1;
	int num2;
	int num3;

	public A(String name, int num1) {
		this.name = name;
		this.num1 = num1;
		System.out.println("A클래스가 메모리에 올라갔습니다. ");
	}
}

class C extends A {

	public int num5;
	public int num4;

	// 생성자
	public C(String pName, int pNum1) {
		// 슈퍼 키워드 super(); : 부모 생성자를 호출하는 키워드이다.
		// 슈퍼 키워드는 맨위로 올라오고 다음에 구현 코드가 와야한다.
		super(pName, pNum1);
		int num4;
		int num5;
	
	}
}
