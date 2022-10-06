package computer;

// 컴퓨터를 상속받음 / 1. 메서드를 재정의
public class DeskTop extends Computer {

	@Override
	public String display() {
		System.out.println("데스크탑 모니터에 출력");
		return null;
	}

	@Override
	public String typing() {
		System.out.println("데스크탑 타이핑 합니다");
		return null;
	}

}
