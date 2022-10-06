package ch09;

public class BankMainTest {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		//bank.balance = 100;

		bank.deposit(10_000);
		
//		bank.withdraw(9000);
		bank.showInfo();
		
		
		//신입 개발자가 실수로 멤버변수에 바로 접근해서 
		//잔액을 수정함
		//bank.balance = 100_000;
		bank.showInfo();
		//실수하는걸 방지하고 
		
		int currentMoney = bank.getBalance();
		System.out.println(currentMoney);
		bank.setBalance(-000);
		bank.showInfo();
		
		
	}

}
