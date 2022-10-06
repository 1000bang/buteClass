package ch04;

import java.util.Scanner;
//jar 자르
public class IfMainTest{
	// main thread
	// start of main
	public static void main(String[] args) {
		//자바는 객체지향 페러다임이다
		
		//제어문 if 
		// 주어진 조건에 따라서 실행이 이루어지도록 구현
		//....이라면
		
		
		boolean flag = true;
		//if문 단독
		//조건이 t이면 실행
		if(flag) {
			System.out.println("조건식이 true이면 여기 구문이 실행됩니다.");
			}
		
		
		
		
		//변수의 효용
		flag = false;
		
		//if else문
		//둘중 하나는 반드시 실행됨
		if (flag) {
			System.out.println("true이면 여기 실행");
		} else {
			System.out.println("flase이면 여기 실행");
		}
		
		
		// if - else if 구문
		//사용자에게 데이터를 입력받아
		System.out.println("성적을 입력하세요");
		Scanner sc = new Scanner(System.in);
		double point = sc.nextDouble();
			
		System.out.println("point : "+ point);
		//괄호안에 조건식
		if(point>= 90) {
			System.out.println("A학점입니다.");
		} else if(point >= 80) {
			System.out.println("B학점입니다.");
		}	else if (point >= 70) {
				System.out.println("C학점입니다.");
		}	else if (point >= 60) {
					System.out.println("D학점입니다.");
		} else {
			System.out.println("F학점입니다.");
		}
		
		//좁은 범위부터 하나하나 
		
		
		
	}//end of main

}//end of class
