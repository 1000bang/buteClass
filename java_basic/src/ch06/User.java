package ch06;

public class User {
	//클래스 영역에서 사용 할 수 있는거
	// 함수, 메서드, 변수, 생성자
	//클래스 영역에서 식은 사용할 수 없다.
	//상태
	String id;
	String pw;
	//String pwCheck;
	String name;
	String gender;
	boolean isPwChecked = false;
	// boolean이 초기값은 false임;;;;;;;;;;;;
	// 근데 선언과 동시에 초기화 할 수 있음을 표현
	int age;
	
//	public void join() {
//		if (pw.equals(pwCheck)) {
//			System.out.println("비밀번호가 일치합니다.");
//			System.out.println(name + "님이 회원가입 완료 되었습니다.");	
//		}else {
//			System.out.println("비밀번호가 일치하지 않습니다.");
//			System.out.println("회원가입 실패");
//		}
//	}
	
	public void join() {
		if (isPwChecked) {
			System.out.println("비밀번호가 일치합니다.");
			System.out.println(name + "님이 회원가입 완료 되었습니다.");	
		}else {
			System.out.println("비밀번호를 먼저 확인해주세요.");
			System.out.println("회원가입 실패");
		}
	}
	
	
	
	public void checkedPw(String inputPw) {
		
		if (pw.equals(inputPw)) {
			isPwChecked = true;
		}else {
			isPwChecked = false;
		}
	}
	
//public void checkedPw() {
//		
//		if (pw.equals(pwcheck)) {
//			isPwChecked = true;
//			System.out.println("비밀번호가 일치합니다.");
//		}else {
//			isPwChecked = false;
//			System.out.println("비밀번호를 먼저 확인해주세요.");
//		}
//	}
	
	public void showInfo() {
		if (isPwChecked) {
		System.out.println(name + "님의 id : " + id);
		System.out.println(name + "님의 비밀번호 : " + pw);
		System.out.println(name + "님의 성별 : " + gender);
		}
		}
	
	
	
	
	
	
	
//	public void checkedPw() {
//		//문자열을 비교할 때는 무조건 equals를 써라
//		//equals는 메서드 
//		if (pw.equals(pwCheck)) {
//			System.out.println("비밀번호가 일치합니다.");
//		}else {
//			System.out.println("비밀번호가 일치하지 않습니다.");
//		}
//	}
	
	
	
	
	
}
