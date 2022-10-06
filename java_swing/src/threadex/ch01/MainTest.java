package threadex.ch01;

public class MainTest {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		SubThread subThread1 = new SubThread();
		SubThread subThread2 = new SubThread();
		SubThread subThread3 = new SubThread();
		
		subThread1.start();
		subThread2.start();
		subThread3.start();

		//Thread란?
		// process : 프로그램이 실행이 되면 OS로부터 메모리를 할당받아 프로세스 상태가 됨
		// thread : 하나의 프로세스에는 하나 이상의 thread를 가지게 되고
		//                 실제작업을 수행하는 단위는 thread이다.
		
		//multi threading (programming) 이란
		// 여러 쓰래드가 동시에 수행되는 프로그래밍, 여러 작업이 동시에 실행되는 효과를 만들어 낼 수 있다.
		//thread는 각각 자신만의 변수나 메서드를 사용할 수 있다.  즉  자신만의 작업공간을 가진다.
		// - > context 자신만의 컨텍스트를 가진다

	
		//멀티쓰레딩프로그램시 주의점 
		//각 쓰레드 사이에서 공유하는 자원이 있을 수 있다. 
		//여러 쓰레드가 자원을 공유하여 작업이 수행되는 경우 서로 자원을 차지하려는 
		// race condition이 발생할 수 있다. (의도하지않은 결과를 만들어 낼 수 있다)
		
		
		//이렇게 여러 thread가 공유하는 자원 중 경쟁이 발생하는 부분을 critical section(임계영역)이라한다.
		// critical section은 문제가 발생할 수 있기 때문에 안정적인 프로그램을 처리하기 위해서는 
		// 동기화(순차적 수행을 지시)처리를 해줘야 한다.
		// 동기화하지 않는다면 오류 발생확률이 높다 
	}

}
