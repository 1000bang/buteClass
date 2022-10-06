package ch03;

import java.util.Scanner;

public class MainTest8 {
	// start of main
	// main thread
	public static void main(String[] args) {

		/*
		 * 클론코딩 (소수점을 비교ㅐ서 큰 수를 화면에 출력하세용 조건 1 스캐너를 사용해 주세여 조건 2 삼항 연산자를 사용해서 판별해 주세요
		 **/

		Scanner sc = new Scanner(System.in);
		System.out.println("실수 a를 입력하세요 : ");
		double a = sc.nextDouble();
		System.out.println("실수 b를 입력하세요 : ");
		double b = sc.nextDouble();

		char which = 0;
		double which_1 = 0;
		which = (a > b) ? 'A' : 'B';
		which_1 = (a > b) ? a : b;
		System.out.println("두 값중 큰 것은 : " + which + "(" + which_1 + ")");

	} // end of main

} // end of class
