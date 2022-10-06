package ch09;

public class Bank {

	int account;
	String userName;
	//정보은닉
	private int balance;
	private String name;
	
	// 입금
	 
	//여기서 보니까 getter는 return값이 포함되고
	// setter는 void 매개변수가 포함됨
	
	public String getName() {
			return this.name;
	}

	public void  setName(String name) {
		this.name = name;
	}
	
	//getter  메서드 /리턴값만 get
	public int getBalance() {
		return this.balance;
	}
	
	//setter 메서드 / 
	public void setBalance(int money) {
		if(money <= 0 ) {
			System.out.println("잘못된 입력입니다");
		}else {
			this.balance = money;
		}
		
		
	}
	
	
	public void deposit(int money) {
		this.balance +=  money;
	}
	
	
	// 출금
	// 캡슐화
	private void withdraw(int money) {
		this.balance -= money;	
		showInfo();
	}
	
	
	
	public void showInfo() {
		System.out.println("계좌잔액 : " +balance + "원");
	}




}
