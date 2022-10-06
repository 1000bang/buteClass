package ch03;

public class MainTest3 {
	// 메인 작업자(메인쓰레드)
	// 코드의 시작점
	public static void main(String[] args) {

		// 여러줄 주석 : /* ~~ */
		// ctrl + shift F : 정렬

		// 복합대입 연산자
		// 다른 연산자와대입연산자를 함께 사용하는 것

		int num1 = 1;
		num1 = num1 + 10;
		
		int num2 = 1;
		// num2 = num2 + 10;
		// 변수를 계속 쓰기 귀찮아
		num2 += 10;

		int num3 = 10;
		num3 -= 100;
		System.out.println(num3);
		
		
		// 위코드를 복합대입 연산자를 사용하지 말고 풀어서 코드를 작성

		int num4 = 10;
		num4 = num4 - 100;

		// 문제 ) 복합연산자로 변경해 주세요
		num1 = num1 * 2;
		num1 *= 2;

		num1 = num1 / 2;
		num1 /= 2;

		num1 = num1 % 2;
		num1 %= 2;
		
		
		

	}// end of main

} // end of class
