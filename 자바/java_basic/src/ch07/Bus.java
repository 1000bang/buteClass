package ch07; //9번 11시

public class Bus {

	// 버스번호
	// 승객수
	// 수익금
	int busNumber;
	int passengercount;
	int income;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	
	//메서드
	//태우다
	public void take(int money) {
		this.passengercount ++;
		this.income += 1300;
		//this.income = 1300 * this.passengercount;
	}
	//내리다
	//방어적코드 
		public void escape(int num) {
			if (passengercount < num) {
				System.out.println("잘못된 요청입니다.");
			}else {
				this.passengercount -= num;	
				System.out.println("--승객이 내려요--");
			}
		
			
		}
	public void showInfo() {
		System.out.println("-------상태창-------");
		System.out.println("버스 번호 : " + busNumber);
		System.out.println("승객수 : " + passengercount);
		System.out.println("수익금 : " + income);
	
	}
	
	
}
