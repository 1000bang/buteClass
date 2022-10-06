package ch09;

public class HeroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hero hero1 = new Hero();
		Hero hero2 = new Hero();
		
		
		//객체지향프로그램 
		//
		//private 접근제어지시자의 데이터를 사용하기 위해 get을 쓴다
		//hero1.getHp(10);  getter는 read only
		int result = hero1.getHp();
		int change = result * 2;
		System.out.println(change);
		System.out.println(10 - hero1.getHp());
	
		
		hero1.setLevel(10);
		hero1.showInfo();
		hero1.setLevel(0);
		//int a = hero1.setLevel(10);
		
		
		
		
		hero1.setName("김개");
		
//		
//		//String 클래스는 참조타입 ? o(클래스)
//		String temp = new String("반가워");
//		//문자열 자주 쓰여 new string하기 번거롭다
//		//특별히 편하게 사용하라고 
//		String temp2 = "반가워";
//		System.out.println("-----");
//		System.out.println(hero1);
//		System.out.println(hero2);
//		
//		if (hero1 == hero2) {
//			System.out.println("주소값이 같다");
//		}else {
//			System.out.println("주소값이 다르다");
		
				
		
		
		
	}

}
