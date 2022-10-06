package interfaces2;

public class MainTest {

	public static void main(String[] args) {
		Television television = new Television();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot robot = new ToyRobot();
		ToyRobot robot2 = new ToyRobot();

//		television.turnOn();
//		television.turnOff();
//		System.out.println("=========");
//		refrigerator.turnOn();
//		refrigerator.turnOff();
//		System.out.println("=========");
//		robot.turnOn();
//		robot.turnOff();
//		System.out.println("=========");

		// 위의 반복되는 코드들을 배열을 사용해 줄여줄 수 있다.
		RemoteController[] remoteControllers = new RemoteController[4];
		remoteControllers[0] = television;
		remoteControllers[1] = refrigerator;
		remoteControllers[2] = robot;
		remoteControllers[3] = robot2;

		// index 를 활용한 for

		// 이니셜라이즈드 포 (포 each문)
		// 리모트컨트롤러 타입의 배열을 한단계씩 진행
		for (RemoteController a : remoteControllers) {
			a.turnOn();
			a.turnOff();
			System.out.println("--------------");
		}

		// 문제 1 for index를 사용해서 전원을 전부 꺼주세요
		for (int i = 0; i < remoteControllers.length; i++) {
			remoteControllers[i].turnOff();
		}

		// 문제 2 배열을 활용해서 toy에 name값을 화면에 출력

		// 1.
		// RemoteController a = remoteControllers[0];
		// a : 주소값 (television 에 주소값)
		// 2. refrigerator a = remoteControllers[1];
		// 3. robot a = remoteControllers[2];
		// robot2 = remoteControllers[3];
		// remoteControllers는 배열이다
		// remoteControllers를 a에 대입한다 데이터 타입은 RemoteController
		// 리모트컨트롤러스[0]부터 마지막까지 1번 돈다

		for (RemoteController a : remoteControllers) {
			if (a instanceof ToyRobot) {
				System.out.println(((ToyRobot) a).name);
			}
		}

		int result = 0;
		for (int i = 0; i < remoteControllers.length; i++) {

			// 주소값의 타입이 Toyrobot이라면
			// instanceof 타입을 비교한다
			if (remoteControllers[i] instanceof ToyRobot) {
				// 다운캐스팅
				System.out.println(((ToyRobot) remoteControllers[i]).name);
				result++;
			}
		}
		System.out.println("장난감 로봇은 " + result + "개 있습니다.");

		// 인터페이스
		// 인터페이스 선언
		// 소리가 나는 기능을 추가해주세요
		// 단 냉장고는 문이 열렸으면 띵띵띵 소리나게
		// 장난감 로봇은 두두두 소리나게
		for (RemoteController b : remoteControllers) {
			if(b instanceof ToyRobot) {
				((ToyRobot) b).sound();
			}else if (b instanceof Refrigerator) {
				((Refrigerator) b).sound();
			}
		}
		
		
	}

}
