package ch07;

public class Test {

	public static void main(String[] args) {
//		Bus bus100 = new Bus(100);
//		bus100.take(1300);
//		bus100.showInfo();
//		bus100.take(900);
//		bus100.showInfo();
//		bus100.take(1300);
//		bus100.showInfo();
//		bus100.escape(3);
//		bus100.showInfo();
//		bus100.escape(1);
//		bus100.showInfo();

	
	Subway subway100 = new Subway(100);
	
	subway100.take(1300);
	subway100.take(1800);
	subway100.take(700);
	subway100.take(1300);
	subway100.take(1300);
	
	subway100.showInfo();
	subway100.getoff(4);
	subway100.showInfo();
	subway100.getoff(2);
	
	subway100.showInfo();
		
		
		
		
		
		
		
		
		
		
	}

}
