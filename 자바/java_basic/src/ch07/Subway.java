package ch07;
//노선번호
//승객수
//수익금



//생성자
	



//showinfo

//타다/내리다


public class Subway {

	int subNum;
	int subCount;
	int subIncome;
	
	//생성자 오버로딩으로 노선번호를 받음
	public Subway(int subNum) {
		this.subNum = subNum;
	}
	
	
	
	//타다
	public void take(int money) {
		this.subCount ++;
		this.subIncome += money;
	}
	
	//내리다
	public void getoff(int num) {
		
		// 1. 10 - 1 = 9
		// 2. 9 - 10 = -1
		// 9 < 리터럴값 0 
		// 방어적 코드라는 것은 매개변수 넘어 온값이 적절한가 검증 
		// 통자 100 , 출금 1000
		if(subCount < num) {
			System.out.println("잘못된 요청을 했습니다 코드가 동작하지 않음");
		}else {
			this.subCount-= num;
		
		}
	}
	
	
	public void showInfo() {
		System.out.println("------------");
		System.out.println("노선번호 : " + subNum);
		System.out.println("현재 승객수 : " +subCount);	
		System.out.println("현재 수입 : " + subIncome);
	}
	
}
