package ch17;

public abstract class Gift {

	String name;
	String price;
	
	
	public Gift() {
		this.name = name;
		this.price = price;
		
	}
	


	// 뽑히다
	public abstract void pick();

	public void showInfo() {
		System.out.println("경품명 : " + name);
		System.out.println("가격 : " + price);
	}
}
