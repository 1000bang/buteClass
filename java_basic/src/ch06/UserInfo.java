package ch06;
//회원가입

public class UserInfo {

	//상태 4개이상
	public String id;
	public int passWord;
	public String email;
	public String address;
	
	
	
	//기능2개이상
	//중복체크
	//비밀번호 체크
	//회원가입한 정보를 보는 기능을 반드시 만들어주세요
	
	
		public void memberShowInfo() {
			System.out.println("회원 id : " + id);
			System.out.println("회원 비밀번호: " + passWord);
			System.out.println("회원 이메일 : " + email);
			System.out.println("회원 주소 : " + address);
		}
		
		public void pwcheck() {
			System.out.println("비밀번호를 체크합니다." );
		
			if (passWord >= 9999) {	
				System.out.println(id + "님 사용가능한 비밀번호 입니다.");
			}else {
				System.out.println(id + "님 비밀번호를 잘못 입력했습니다.");
		}

			

	
		}
	
		



}
