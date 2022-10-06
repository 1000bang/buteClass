package threadex;

// 1. thread 를 생성하는 첫번째 방법(상속을 이용하기)

class MyThread1 extends Thread {
	String name;

	public MyThread1(String name) {
		this.name = name;
	}

	// 새로운 작업자ㅎ한테 일을 시킬려면 특정한 메소드 안에서 코드를 해주어야 한다.
	// 약속

	@Override
	public void run() {
		int i;
		for (i = 0; i < 50; i++) {
			System.out.println(this.name + " : " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}// end of MyThread1

class MyThread2 extends Thread {

	String name;

	public MyThread2(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		int i;
		for (i = 0; i < 50; i++) {
			System.out.println(this.name + " : " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	} // end of MyThread2

	public static void main(String[] args) {
		System.out.println("현재 쓰레드 정보 얻기 : " + Thread.currentThread());
		System.out.println("메인쓰레드가 화면에 글자를 출력합니다");
		MyThread1 thread1 = new MyThread1("서브작업자1");
		// 메인작업자가 서브작업자한테 일을 시작해 - > run() 메서드 호출
//			thread1.run();
		thread1.start();
		MyThread1 thread2 = new MyThread1("서브작업자2");
		// thread2.run();
		thread2.start();

		System.out.println("메인쓰레드 (작업자) 일 종료 ");
		// 동시에 작업시킬려면 start 메서드를 사용

	}
}

//서브 작업자
