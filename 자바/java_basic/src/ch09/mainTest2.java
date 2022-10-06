package ch09;

public class mainTest2 {

	public static void main(String[] args) {
		
		Hero hero1 = new Hero();
		Hero hero2 = new Hero();
		
		
		if (hero1 == hero2) {
			System.out.println("주소값이 같다");
		}else {
			System.out.println("주소값이 다르다");
		}
				
		String s1 = "반가워";
		String s2 = "반가워";
		String s3 =new String("반가워");
	
		if (s1 == s2) {
			System.out.println("주소값이 같음");
		}else {
			System.out.println("주소값이 다름");
		}
		if (s2.length() == s3.length() ) {
			System.out.println("길이가 같음");
		}else {
			System.out.println("길이가 다름");
		}
		
		
		
		
		
	}// end of main

}// end of class
