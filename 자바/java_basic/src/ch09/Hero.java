package ch09;

public class Hero {

	private String name;
	private int hp;
	private int pow;
	private double depense;
	private int lv;
	
	
	
	// getter, setter 메서드를 만들어주세요
	// 단 setter 메서드의 방어적 코드를 넣어주세요
	// setName 메서드 만들 때 2글자 이상 입력하게 만드시오
	
	
	public int getHp() {
		return hp ;
	}
	
	public int aaa() {
		return hp;
	}
	
	public int getasdj() {
		return hp;
	}
	
	public int getaf() {
		return pow;
	}
	
	public void setasdfj(int a) {
		this.hp = a;
	}
	
	public void setName(String name) {
		if(name.length() <= 2){
			System.out.println("3글자이상 입력하시오");
		} else {
			this.name = name;
		}
		
		
	}
	
	public String getAsdf() {
		return name;
		
	}
	
	public void setLevel(int lv) {
	if(lv <= 0) {
		System.out.println("잘못입력함");
	}else {
		this.lv = lv;
	}	
	}
	
//	public void setName(String a) {
//		if (length(a) < 2) {
//			System.out.println("2글자 이상으로 입력하세요");
//		}else {
//			this.name = a;
	
	
	
	
	
	
	

	public void showInfo(){

		System.out.println("level : " + lv);
		
	}
	
}
