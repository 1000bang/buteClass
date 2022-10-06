package ch10;

public class CardTest {

	public static void main(String[] args) {
		
		Card card1 = new Card();
		card1.setCardName("체크");
		card1.setName("김개똥");
		
		System.out.println("---------");
		System.out.println("이름 : " + card1.getName() + "\n카드이름 : " + card1.getCardName() + "\n카드번호 : " + card1.getCardNum());
		
		
		Card card2 = new Card();
		card2.setCardName("체크");
		card2.setName("김소똥");
		
		System.out.println("---------");
		System.out.println("이름 : " + card2.getName() + "\n카드이름 : " + card2.getCardName() + "\n카드번호 : " + card2.getCardNum());
		
		
		Card card3 = new Card();
		card3.setCardName("체크");
		card3.setName("김말똥");
		
		System.out.println("---------");
		System.out.println("이름 : " + card3.getName() + "\n카드이름 : " + card3.getCardName() + "\n카드번호 : " + card3.getCardNum());
		

	}

}
