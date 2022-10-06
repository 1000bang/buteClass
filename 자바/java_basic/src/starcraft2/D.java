package starcraft2;

public class D {

	public D() {
		System.out.println("D클래스를 메모리에 올려 객체화 했습니다.");
	}

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.b);
		System.out.println(a.b.c);
		System.out.println(a.b.c.d);

		// System.out.println(a.b.c.d.showInfo());
		// a.b.c.d.showInfo();
		// System.out.println("=============");
		// 메인함수 안에 지역변수를 선언(변수명은 temp)
		// D클래스 (객체)안에 있는 멤버변수 numberId를 저장하고
		// 화면에 temp를 출력해서 확인하세요

		// int temp = a.b.c.d.numberId;
		// System.out.println(temp);



	}

}
