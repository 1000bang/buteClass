package wraper;

public class MainTest5 {

	public static void main(String[] args) {
		String name = "이순신";

		switch (name) {
		case "홍길동":
			System.out.println("name 값은 홍길동 입니다. ");
			break;

		case "이순신":
			System.out.println("name 값은 이순신 입니다.");
			break;
		case "김민우":
			System.out.println("name 값은 김미누 입니다.");
			break;
		default:
			System.out.println("name 값은 " + name + " 입니다.");
		}

	}

}
