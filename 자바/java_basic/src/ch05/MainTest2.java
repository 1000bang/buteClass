package ch05;

public class MainTest2 {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior ();
		w1.name = "오크";
		w1.height = 10;
		w1.power = 100;
		w1.color  = "초록색";
		
		//몬스터 하나 더 값을 ㅏㄹ다애서 만들고
		
		Warrior w2 = new Warrior ();
		System.out.println("-----상태창------");
		w2.name = "엘프";
		w2.height = 190;
		w2.power = 50;
		w2.color  = "흰색";
		System.out.println("이름 :  " + w2.name);
		System.out.println("키  :  " + w2.height);
		System.out.println("파워 :  " + w2.power);
		System.out.println("색상 :  " + w2.color);
		
		System.out.println("---------------");

		
	
	
	}

}
