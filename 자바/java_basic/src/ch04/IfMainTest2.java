package ch04;

import java.util.Scanner;

public class IfMainTest2 {

	//main thread
	// start of main
	public static void main(String[] args) {
		
		
		/* 1. 논리곱 연산 활용 100-91  A학점
					90-81 B학점 
					80-71 C학점 나머지 F
		*/
		System.out.println("성적을 입력해 주세요");
		Scanner scanner = new Scanner(System.in);
		int point = scanner.nextInt();
		
		if (point <= 100 && point > 90) {
			System.out.println("A학점입니다.");
		} else if (point <= 90 && point > 80) {
			System.out.println("B학점입니다.");
		} else if (point <= 80 && point > 70) {
			System.out.println("C학점입니다.");
		} else {
			System.out.println("F학점입니다. ");
		}
	
	
		
	} //end of main	
} // end of class
