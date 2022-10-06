package ch03;

import java.util.Scanner;

public class MainTest7 {
	// start of main
	// main thread
	public static void main(String[] args) {

		//삼항 연산자
		// 조건식 ? 결과1 : 결과2
		
		int num1 = (5>1) ? 10 : 20;
		System.out.println(num1);
		
		
		System.out.println("입력 받은 두 수중 큰 수를 출력하세요");
		
		//scanner  사용자의 키보드 값을 입력받음
		//nextint    정수값을 입력받을 것이라 인지 	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 x 입력   : ");	
		int x =sc.nextInt();
		System.out.println("정수 x  :" + x );
		System.out.println("정수 y 입력   : ");		
		int y =sc.nextInt();
		System.out.println("정수 y  :" + y );

		//사용자 입력값 x, y 중 큰 수를 출력하고 싶다 
		int max = 0;
		max = (x>y) ? x:y;
		System.out.println("사용자가 입력한 x와 y 중 큰 수는 " + max + "입니다.");
		
		
		
		//실수 ver
		System.out.println("실수 a 입력  : ");
		double a = sc.nextDouble();
		System.out.println("a 값 : "+ a);
		
		
		
	} // end of main

} // end of class
