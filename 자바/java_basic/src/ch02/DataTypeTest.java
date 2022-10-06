package ch02;

public class DataTypeTest {
	//main 시작점
	public static void main(String[] args) {
		// 테스트
		
		//1. 정수 550 을 name1 이름으로 변수에 담아
		int name1 = 550;
		// 2.정수 22억을 name2 이름으로 변수에 담아
		long name2 = 220000000;
		// 3. 문자 A를 name3 이름으로 담아
		char name3 = 'A';
		// 4. 실수 float타입으로 0.12344567 을 name4 이름으로 담아
		float name4 = 0.12345678F;
		//의도 : 접미사를 알고 있는가 ? (기본 연산단위)
		// F / D / L ( int/ double)
		// 혹은 강제 형변환으로 해결할 수 있음
		float name4_1 = (int)0.12345576;
		float name4_2 = (float)0.12345576;
		int name4_3 = (short)12345576; //강제 형변환은 (short) (byte)  다 쓸수 있음 8byte빼고
		// 5. 실수 double 타입으로 200.00112을 name5 이름으로 담아
		double name5 = 200.00112;
		// 6. 논리 자료형 isOk라는 이름으로 변수를 선언
		boolean isOk ;
		// 7. isOk변수에 리터럴 값 false로 초기화 해보
		isOk = false;
		// 8. isOk 변수 값을 true 로 변경
		isOk = true;
		//9. 변수란 무엇인지 서술해보세여
		//10. 기본 데이터 타입 종류 8가지와 크기를 서술해주세여
		
		
		
		
		System.out.println("name1 : " + name1);
		System.out.println("name2 : " +name2);
		System.out.println("name3 : " +name3);
		System.out.println("name4 : " +name4);
		System.out.println("name4_1 : " +name4_1);
		System.out.println("name4_2 : " +name4_2);
		System.out.println("name5 : " +name5);
		System.out.println("isOk : " +isOk);
		System.out.println("isOk : " +isOk);
		System.out.println("변수란 ?\n 변하는 수\n 값(주소값)을 저장할 수 있는 메모리 공간");
		System.out.println("기본 데이터 타입 종류 : \n  byte / boolean : 1 byte \n short / char : 2byte \n int / float : 4byte \n long/ double :8byte ");
		
	} // end of main

} //end of class
