package ch04;

import java.util.Scanner;

public class MainTest1 {

	public static void main(String[] args) {
		
		//1. a 변수에 10을 b변수에 20을 담아둔다.
		//a변수와 b변수에 값을 서로 바꿔서 출력해 보세요
		
		int a = 10;
		int b = 20;
		int c = 0;
		c = a;
		a = b;
		b = c;
		System.out.println("바뀐 a값 : " + a);
		System.out.println("바뀐 b값 : " + b);
		
		//2. 시작값 종료값을 받아서 (사용자입력) 연산에 합을 출력해보세요
		
		System.out.println("시작값을 입력해 주세요");
		Scanner scanner = new Scanner(System.in);
		int start = scanner.nextInt();
		
		System.out.println("종료값를 입력해 주세요");
		Scanner scanner1 = new Scanner(System.in);
		int finish = scanner1.nextInt();
		
		int result = 0;
		for (int i = start; i <= finish ; i++) {
			result = result + i ;
			System.out.println("result : " + result + "   i : " + i);
			
		}
		
		System.out.println("시작값 + 종료값 : " + result);
		
		
		//3. 2번 문제를 변수하나를 상수로 변경해서 코드를 수정해 보세요
		System.out.println("시작값을 입력해 주세요");
		Scanner scanner2 = new Scanner(System.in);
		int start1 = scanner.nextInt();
		
		System.out.println("종료값를 입력해 주세요");
		Scanner scanner3 = new Scanner(System.in);
		final int finish1 = scanner1.nextInt();
		
		int result1 = 0;
		for (int i1 = start1; i1 <= finish1 ; i1++) {
			result1 = result1 + i1 ;
		}
		
		System.out.println("시작값 + 종료값 : " + result1);
		

}
}
