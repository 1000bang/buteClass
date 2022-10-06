package threadex.ch03;

public class MainTest{

	public static void main(String[] args) {
	//현재 10만원들어가 있는 생성
		BankAccount bankAccount = new BankAccount();
		
		Father father = new Father(bankAccount);
		Mother mother = new Mother(bankAccount);
		
		
		// 아버지가 먼저 입금 만원
		father.start();
		
		//어머니가 출금 오천원
		mother.start();
		
		
		
		//정상처리 금액 10 + 1 - 0.5 -> 10만오천원
		
		//레이스 컨디션 상태일 때 즉 임계영역이 발생할 때는 
		//의도 하지 않은 결과를 생성시킬 수 있다.
		
		// 그래서 다른 작업자 (쓰레드가) 사용하지 못하도록 동기화 처리를 해주어야 
		// 안정적인 결과값을 얻을 수 있다. (lock 걸어주는거)
		
		//해결 방법
		// 자바에서는 동기화처리 
		//1. (synchronized) 메서드
		//2. synchronized 블록
	}

}
