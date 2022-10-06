package ch07; //3

public class Userinfo {

	String userId;
	String userPw;
	String userName;
	int userAge;
	
//	 멤버변수와 매개변수의 이름이 같을 때 this를 활용한다.
//			 this는 자기자신을 의미
//			 this가 class 안에 있기 때문에 
//			 이 class안에 있는 userId 멤버변수 사용 
	
	
	public Userinfo(String userId) {
		
		this.userId = userId;
	}
	
	public Userinfo(String userId, String userPw ) {
		this.userId = userId;
		this.userPw = userPw;
	}
	
	public Userinfo(String userId, String userPw, String userName) {
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
	}
	public Userinfo(String userId, String userPw, String userName, int userAge) {
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userAge = userAge;
	}
	
} //end of class
