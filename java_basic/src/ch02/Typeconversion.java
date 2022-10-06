package ch02;

public class Typeconversion {

	public static void main(String[] args) {
		
		//형변환 Type conversion
		//원래 가지고 있던 데이터 타입을 다른 데이터 타입으로 변환
		
		//형변환의 2가지 종류 
		// 1. 묵시적 형 변환 > 자동 형변환
		// 2. 명시적 형 변환 > 강제 형변환
		
		int iNumber1 = 100;	
		System.out.println(iNumber1);
		//문제 : iNumber 변수를 dNumber변수에 담아보세요 . 단, 데이터 타입은  더블
		double dNumber = iNumber1;
		System.out.println(dNumber);
		// 4byte크기의 데이터가 8byte로 변환되는 데에는 아무 문제 없음  자동 형 변환
		
		System.out.println("--------------");
		double dNumber2 = 1.1234;
		int iNumber2 = (int)dNumber2;
		System.out.println(iNumber2);
		// 8byte 크기의 데이터가 4byte크기로 강제로 변환시킴 강제 형 변환
		
		
		//연습
		System.out.println("---------연습--------");
		double a;
		int b;
		
		//1. a에 값을 0.5 담아보세요
		a = 0.5;
		
		// 2. b에 값을 10.5를 담아보세요
		
		//b = (double)10.5;
		b = (int)10.5;
		
		//int b = 10.5; 가 가능하려면 10.5를 정수형으로 변환해야함 >  int 강제 형변환을 사용 
		
		
		//3. 화면에 b를 출력
		System.out.println(b);
		
		// 서로 다른 자료형 간에 연산등을 수행하기 위해 자료형을 통일
		
		
		
		
	} //end of main

} //end of class
