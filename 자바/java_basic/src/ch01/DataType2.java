package ch01;

public class DataType2 {

	public static void main(String[] args) {

		char name ; //2byte 공간에 문자 하나를 담을 수 있다. 
		char a = '가';
		char initial;
		
		//값을 초기화하는 방법
		//name ="A"; 쌍따옴표 x char type은 홀 따옴표를 사용
		//name = 'ab'; 오류발생 char type 은 단 하나의 문자를 저장할 수 있다.
		name = 'a';
		
		// 1. name 변수를 화면에 출력하시오
		// 2. 문자 a를 화면에 출력하시오
		// 3. 문자 b 
		// 3. 문자 c
		
		char name2 = 'a';
		System.out.println(name2);  //변수를 출력
		System.out.println("a");   		//값을 출력
		System.out.println("b");
		System.out.println("c");
		
		
		
	}// end of main

} //end of class
