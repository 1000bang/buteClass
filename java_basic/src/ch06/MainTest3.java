package ch06;

import java.util.Scanner;

public class MainTest3 {

	//사용자 입장
	public static void main(String[] args) {
		
		User user = new User();
//		user.id = "asdf";
//		user.pw = "1234";
//		//user.pwCheck =  "1234";
//		user.name ="홍길동";
//		user.gender = "남자";
//		
//		//조건 : 회원가입시에 반드시 비밀번호 체크가 true가 되어야 한다.
//		user.checkedPw("1232");
//		user.join();
		
		
		//스캐너 활용해서 값을 담아주세요
		// 단 스캐너를 활용해서  User객체에 값을 담아주세요
		// 활용 예시 String temp = scanner.nextLine();
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("이름을 입력하세요 ");
		String inputname = scanner.nextLine();
		user.name = inputname;
		
		System.out.println("아이디를 입력하세요");
		String inputid = scanner.nextLine();
		user.id = inputid;
		
		
		System.out.println("비밀번호를 입력하세요");
		String inputpw = scanner.nextLine();
		user.pw = inputpw;
		
		System.out.println("성별을 입력하세요");
		String inputgender = scanner.nextLine();
		user.gender = inputgender;
		
		user.checkedPw("1234");
		user.join();
		user.showInfo();

	}

}
