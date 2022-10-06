package ch01;

public class DataType1 {

	// main함수는 코드의 시작점
	public static void main(String[] args) {
		
		//데이터 타입에 종류 
		//1. 기본 데이터 타입(primitive type) 
		//2. 참조 타입  (reference type)
		
		//기본 데이터 타입의 종류
		byte b; //1bite (8bit)
		short s; //2bite (16bit)
		int i;  // 4bite (32bit)  가장 많이 사용
		long l; // 8bite (64bit) 
		
		//b = 128;  오류 byte 는 10진수로 +127/-128까지만 사용가능
		b = 127;
		b = -128;
		//i = 21000000000;
		//접미사를 사용해야한다. (대소문자 사용가능 권장은 대문자)
		//long은 L / float은 f
		l = 21000000000l;
		l = 21000000000L;
		
		
		float f = 11.0f;
		// float은 소수점을 가지고 있을 때 무조건 f 붙여야 함
		// 실수의 기본값은 double 이기 때문 !!
		
		double d = 210000000000.0;
		d = 11.0;
		d = 11.11111111111111111111111;
		double dasf = 11.0d;
		double asdf = 11.1111111111111111f;
		double asdf1 = 2100000000000000l;  //f,d,l  다됨;;; 8진수이고, 실수의 기본 값이기 때문
		
		//기본 연산자 : 정수 int / 실수 double
		
		
		
		
	}// end of main

} //end of class

//블록에 유효범위는 절대적이다
