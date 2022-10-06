package student2;

public class Student {
	// 1. 변수생성
	private String name;
	private int budget;
	private int busCount;
	private int subwayCount;
	private int lunch;
	private int lunchPay;
	private static int totalLunch;
	private int busPay;
	private int subwayPay;
	private static int totalBus;
	private static int totalSubway;

	// 2.생성자
	public Student(String name, int budget) {
		this.name = name;
		this.budget = budget;
	}

	// 3 게터 메서드

	public int getBudget() {
		return budget;
	}

	public String getName() {
		return name;
	}

	public int getBusCount() {
		return busCount;
	}

	public int getSubwayCount() {
		return subwayCount;
	}

	public int getLunchPay() {
		return lunchPay;
	}

	// statice 활용하고 싶었는데... 주말에 해결해봄
	// 여러 사람의 데이터를 저장하고 총수입이 합쳐서 나오는 걸 구상
	public Student() {
		totalLunch += lunchPay;
		this.lunchPay = totalLunch;
	}
	// 이거 만드는 거 좀 어려웠음 ;
	// 위에서 생성자? 모양으로 써서 그런가 같은 이름으로 안만들어짐
	// 이거 게터 메써드 임 ? ㅇㅇ
	// 리턴 값 있고 멤버변수 활용함

	public int getBusPay(Bus bus) {
		return bus.getFare() * this.busCount;
	}

	public int getSubwayPay(Subway subway) {
		return subway.getFare() * this.subwayCount;
	}

	// 4. 행동
	// 버스타다
	public void getOnBus(Bus bus) {
		// 방어적 코드 생성
		// 예산이 요금보다 작으면 걸어다녀 함
		// 그렇지 않으면 진행
		if (this.budget < bus.getFare()) {
			System.out.println("버스 탈 돈 없음 뚜벅이  ");
		} else {
			this.busCount++;
			this.budget -= bus.getFare();
			System.out.println(bus.getName() + " 버스탐 남은 용돈 : " + budget);
		}
	}

	// 지하철타다
	public void getOnSubway(Subway subway) {
		if (this.budget < subway.getFare()) {
			System.out.println("지하철   탈 돈 없음 뚜벅이  ");
		} else {
			this.subwayCount++;
			this.budget -= subway.getFare();
			System.out.println(subway.getName() + " 지하철 남은 용돈 : " + budget);
		}
	}

	// 밥먹다 3가지
	// 방어적 코드 생성
	// 예산이 요금보다 굶어야 함
	// 그렇지 않으면 진행
	public void eatMiso(Lunch lunch) {
		if (this.budget < lunch.getMiso()) {
			System.out.println("밥 먹을 돈 없음");
		} else {
			this.budget -= lunch.getMiso();
			this.lunchPay += lunch.getMiso();
			System.out.println("된장찌개 먹음 남은 용돈 : " + this.budget);
		}
	}

	public void eatGogi(Lunch lunch) {
		if (this.budget < lunch.getGogi()) {
			System.out.println("밥 먹을 돈 없음");
		} else {
			this.budget -= lunch.getGogi();
			this.lunchPay += lunch.getMiso();
			System.out.println("불고기 먹음 남은 용돈 : " + this.budget);
		}
	}

	public void eatCurry(Lunch lunch) {
		if (this.budget < lunch.getCurry()) {
			System.out.println("밥 먹을 돈 없음");
		} else {
			this.budget -= lunch.getCurry();
			this.lunchPay += lunch.getMiso();
			System.out.println("카레 먹음 남은 용돈 : " + this.budget);
		}
	}

	// 5. 쇼인포
	public void showInfo() {
		System.out.println(this.name + "의 남은 돈 : " + this.budget);
	}// end of class
}
