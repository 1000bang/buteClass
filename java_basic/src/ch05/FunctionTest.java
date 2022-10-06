package ch05;

public class FunctionTest {

	//main 함수
		//void 텅빈 : 반환값이 없다
	public static void main(String[] args) {
		
		
		// 함수를 사용할때는 함수를 호출한다.
		int myResult =   addNum(10,100);
		System.out.println(myResult);
		
		sayHello("안녕하세요");
		sayHello("반갑습니다");
		sayHello("영광입니다");
		
		System.out.println("---------");
		
		int myResult2 = calcSum();
		System.out.println(myResult2);
		
		int num1 = 10;
		
		
	} //end of main
		//함수를 설계 (모양/ 함수를 사용하는 모양)
	public static int addNum(int n1, int n2) {
		// 두개에 매개변수를 받아서 덧셈하는 기능 만들기 
		//함수 안에 사용하는 변수를 지역변수라고 부른다.
		int result;
		result = n1 + n2;
		return n1 + n2;
		
	}//end of addNum
	
	//리턴값이 없는 함수 설계
	public static void sayHello(String greeting) {
		System.out.println(greeting + "^^");
		
	}// end of sayHello
	
	//매개변수 없는 함수
		public static int calcSum() {  //함수의 선언부
			 int sum = 0;                                   //함수의 몸체 body
			 int i;
			 
			 for(i = 0; i <= 100; i++) {
				 //sum = sum + i;
				 sum += i;
			 }
			 
			
			return sum;    //리턴값있는 변수는 리턴값 먼저쓰고 기본값 대입 마지막에 수정 
		}
	
	
	
}//end of class
