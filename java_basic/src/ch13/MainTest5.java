package ch13;

public class MainTest5 {

	public static void main(String[] args) {
	Customer customer1 = new Customer();
	Customer customer2 = new VipCustomer(); // Customer 클래스는 VipCustomer로 바라볼 수 있음 다형성
	//customer1. 보너스포인트, 보너스비율, 커스터머등급 보임
	//customer2. 보너스포인트, 보너스 비율, 커스터머 등급 보임
	//컴파일 시점에는 문법검사 데이터타입만을 바라봄 
	//데이터타입이 Customer이기 때문에 커스터머의 메서드와 멤버변수만 알 수 있음
	// 업캐스팅 상태 
	//customer2.salseratio = 10; 업캐스팅 상태를 다운캐스팅 해서 접근해야한다.
	//Customer customer2 = (VipCustomer) new VipCustomer(); 혹은
	((VipCustomer)customer2).salesRatio = 10; // 형변환
	
	
	VipCustomer VipCustomer1 = new VipCustomer();
	//VipCustomer1. 보너스포인트. 보너스비율, 커스터머 등급, 세일즈비율 보임
	
	
	
	}

}
