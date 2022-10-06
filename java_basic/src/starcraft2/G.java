package starcraft2;

public class G {

	public G() {
		System.out.println("G클래스를 메모리에 올려 객체화 했습니다.");
	}

	public static void main(String[] args) {

		F f1 = new F();
		System.out.println("=============");
		System.out.println(f1);
		System.out.println(f1.g);
		System.out.println("=============");
		// 메인함수 안에 지역변수를 선언(변수명은 temp)
		// D클래스 (객체)안에 있는 멤버변수 numberId를 저장하고
		//화면에 temp를 출력해서 확인하세요

	}

}
