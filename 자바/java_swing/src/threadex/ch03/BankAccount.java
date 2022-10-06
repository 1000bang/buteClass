package threadex.ch03;

public class BankAccount {

	private int money = 100_000;

	public int getMoney() {
		return this.money;
	}

	public void setMoney(int money) {
		if (money <= 0) {
			System.out.println("잘못된 입력값입니다.");
		} else {
			this.money = money;
		}
	}

	// 입금하기
	// 싱크로나이즈 메서드
	public synchronized void saveMoney(int money) {
		int currentMoney = getMoney();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(currentMoney + money);
		System.out.println("입금 후 잔액 : " + getMoney());
	}

	// 출금하기
	public void withdrawMoney(int money) {
	//싱크로나이즈 블록
		synchronized (this) {
			int currentMoney = getMoney();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			setMoney(currentMoney - money);
			if (currentMoney >= money) {
				System.out.println("출금 후 잔액 : " + getMoney());
			} else {
				System.out.println("계좌잔액이 부족합니다.");

			}
		}
	}

	// 출금하기

}
