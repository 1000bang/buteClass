package student;

public class Student {
	// 1. 변수생성
	private String name;
	private int budget;
	private int busCount;
	private int subwayCount;
	private int lunch;
	private int lunchPay;
	

	// 2.생성자
	public Student(String name) {
		this.name = name;
		this.budget = 80_000;
	}

	// 3 게터 메서드

	public int getBudget() {
		return budget;
	}
	public String getName() {
		return name;
	}
	
	public int getBusCount () {
		return busCount;
	}
	public int getSubwayCount() {
		return subwayCount;
	}
//	public int getLunchPay() {
//		return lunchpay;
		
//	}
	
	// 4. 행동
	// 버스타다
	public void getOnBus (Bus bus) {
		this.busCount ++;
		this.budget -= bus.getFare(); 
		System.out.println(bus.getName() +" 버스탐 남은 용돈 : " + budget);
	}

	// 지하철타다
	public void getOnSubway(Subway subway) {
		this.subwayCount++;
		this.budget -= subway.getFare();
		System.out.println(subway.getName() +" 지하철 남은 용돈 : " + budget);
	}
	
	
	//밥먹다
	
//	public void eatLunch(Lunch lunch) {
//		//if (this.lunch.equals(lunch.getCurry())) {
//		if (this.lunch == 1) {
//				this.budget -= lunch.getMiso();
//				System.out.println("된장찌개 먹음 남은 용돈 : " + this.budget);
//		}else if (this.lunch == 2) {
//			this.budget -= lunch.getGogi();
//			System.out.println("불고기 먹음 남은 용돈 : " + this.budget);
//		}else if (this.lunch == 3){
//			this.budget -= lunch.getCurry();
//			System.out.println("카레 먹음 남은 용돈 : " + this.budget);
//		}else {
//			System.out.println("잘못 입력하셨습니다");
//		}
//	}
	
	public void eatMiso(Lunch lunch) {
		this.budget -= lunch.getMiso();
		System.out.println("된장찌개 먹음 남은 용돈 : " + this.budget);
	}
	public void eatGogi(Lunch lunch) {
		this.budget -= lunch.getGogi();
		System.out.println("불고기 먹음 남은 용돈 : " + this.budget);
	}
	public void eatCurry(Lunch lunch) {
		this.budget -= lunch.getCurry();
		System.out.println("카레 먹음 남은 용돈 : " + this.budget);
	}
	
	
	// 돈

	// 5. 쇼인포
	public void showInfo() {

		System.out.println(this.name + "의 남은 돈 : " + this.budget);
	}

}
