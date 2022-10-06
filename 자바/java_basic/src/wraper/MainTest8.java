package wraper;

import java.util.Scanner;

public class MainTest8 {

	public static void main(String[] args) {
		
		showMedal(Medal.SIVER);
	}

	private static void showMedal(Medal medal ) {
		Medal localMedal = medal;
		switch (localMedal) {
		case GOLD:
			System.out.println("금메달입니다.");
			break;
		case SIVER:
			System.out.println("은메달입니다.");
			break;
		case BRONZE:
			System.out.println("동메달입니다.");
			break;

		default:
			System.out.println("노메달입니다.");
			break;
		}
	}

}

//String medal = "GOld"; 의미는 맞지만 지정한 데이터와 입력값이 달라 오류를 발생시킬 수 있다.

		//enum 열거타입 
		
		//멤버변수를 이넘에 지정된 변수만 사용할 수 있음 -> 프로그램 안정화 