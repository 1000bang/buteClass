package ch04;

import java.util.Scanner;

public class IfMainTest2_1 {

	// main thread
	// start of main

	public static void main(String[] args) {
		
		System.out.println("성적을 입력해 주세요");
		Scanner scanner = new Scanner(System.in);
		int point = scanner.nextInt();		
		char result = '0';
		//변수의 활용
		// result 값을 z로 지정 
		// if 조건에 해당하면 값이 변경됨
		// result + 학점입니다. 
		if (point <= 100 && point > 90) {
			result = 'A';
		} else if (point <= 90 && point > 80) {
			result = 'B';
		} else if (point <= 80 && point > 70) {
			result = 'C';
		} else  {
			result = 'F';
		}
		System.out.println(result + "학점입니다.");
		
		
		
		
		//방어적 코드
		// result의 값이 변경되었다면 result + 학점
		// 변경 되지않았다면 100이상의 값이 입력되었다는 뜻
		// 잘못된 값을 입력하였습니다.
		if(result != 'Z') {
			System.out.println(result + "학점입니다.");
		} else {
			System.out.println("잘못된 값을 입력하였습니다.");
		}
		
		
	} // end of main
} // end of class
