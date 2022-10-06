package ch02;

public class DataType4 {
	//메인함수 코드의 시작점
	public static void main(String[] args) {

		// 기본자료형 -> 논리 자료형 (사실을 관찰하고 결과값이 참,거짓인지 판별)
		// T or F
		// 1byte 사용
		// 값이 존재하는 지/ 결과가 참인지거짓인지 표현
		
		boolean isMarried = false; //변수 선언과 동시에 초기화
		System.out.println(isMarried);
		
		isMarried = true;
		System.out.println(isMarried);
		
		
		//isMarried = (boolean)0;   -> X
		//java에서는 오직 T/F의 값만 출력
		
		
		
	} // end of main

} // end of class
