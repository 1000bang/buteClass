package ch03;

public class MainTest2 {

		//코드의 시작점
		// 메인작업자 (메인 쓰레드)
	public static void main(String[] args) {
		
		//산술연산자
		int num1 = 5+3;
		int num2 = 5-3;
		int num3 = 5*3;
		// int num4 = 5/3; -> 화면에 1 출력
		// double num4 = 5/3; -> 화면에 1 출력
		//리터럴 부분이 대입연산자 보다 먼저  저장되었기 때문
		
		double num4= 5.0/3.0; 
		double num4_1 = 5/3.0;  //실무에서는 이 방법 사용!
		double num4_2 = 5/3F;  // 실무 사용 x
		
		int num5 = 5%3;
		
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num4_1);
		System.out.println(num4_2);
		System.out.println(num5);
		
		
		//문제 
		// 1. (12+3)/3 값을 출력하고 값이 맞는지 검증
		System.out.println((12+3)/3);
		double a = ((12+3)/3.0);
		System.out.println(a);
		// 2.(25 %2)값 화면에 출력
		System.out.println((25%2));
		
		
		

	} //end of main

}  //end of class
