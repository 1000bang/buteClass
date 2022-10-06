package ch10;

public class Card {

	//1. 멤버변수 선언
	public static int serialNum;
	private int cardNum;
	private String cardName;
	private String name;
	
	//2. getter setter 
	
	public int getCardNum() {
		return cardNum;
	}
	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//3. 생성자
    // static serailNum을 ++ 해주고 cardNum에 대입해준다 why?
    // 변수에 본인고유번호를 저장하기 위해 
	
	public Card() {
		serialNum++;
		this.cardNum = serialNum  ;
		}
	
}
