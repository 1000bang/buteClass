package ch06;

public class MainTest2 {

	public static void main(String[] args) {
		UserInfo userinfo1 = new UserInfo();
	
		userinfo1.id = "hahah123";
		userinfo1.passWord = 12345;
		userinfo1.address = "부산동구";
		userinfo1.email = "asdfj@naver.com";
		
		UserInfo userinfo2 = new UserInfo();
		userinfo2.id = "kikik123";
		userinfo2.passWord = 123;
		userinfo2.address = "부산남구";
		userinfo2.email = "gogog124@naver.com";
	
		userinfo1.memberShowInfo();
		System.out.println("-------------");
		userinfo2.memberShowInfo();
		System.out.println("-------------");
		userinfo1.pwcheck();
		System.out.println("-------------");
		userinfo2.pwcheck();
	}

}
