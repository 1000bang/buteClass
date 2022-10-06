package ch05;

public class FunctionImportant {

	public static void main(String[] args) {
		//1. 화면에 바로 출력하는 방법
				//2. 지역변수 생성해서 데이터를 잠시 보관
				
				//1 
				System.out.println(intAdd(10,20,30));
				int intAddResult = intAdd(10,10,30);
				System.out.println(intAddResult);
				
				// 지역변수 result 는 stack에 공간을 할당 받고 
				// n1 + n2 + n3를 대입 받아 저장됨
				// return 되어 데이터를 반환하고(함수 intAdd에 들어감) 이후 stack 에서 삭제
				
				
				//2
				System.out.println(doubleAdd(10,20,30));
				System.out.println(doubleAdd(10.0, 10.0, 10.0));
				double doubleResult = doubleAdd(20.0, 20.0, 20.0);
				//3
				
				printArticle("안녕하세여");
				//리턴받을 값이 없어서 이렇게 사용 못함
				//String s = printArticle("안녕");
				//System.out.println(printArticle("안녕"));
			
				// 함수의 활용 : 3자리 수 정수값 매번 덧셈해서 결과를 받아야 한다면 
				//                     틀을 만들어 놓고 재활용 해서 씀
				
	} // end of main
	
	
		//함수를 만들어 봅시다
		//1. 리턴값이 int, 매개변수 n1, n2, n3 이름은 intAdd
	
	
		//함수의 설계
		public static int intAdd (int n1, int n2, int n3) {
			//	int result = n1 + n2 + n3;
			//	return result;
			return n1 + n2 + n3;
		}
	
	
	
		//2. 리턴값이 double, 매개변수 d1, d2, d3 이름은 doubleAdd
	
		public static double doubleAdd(double d1, double d2, double d3) {
			double result = d1 + d2 + d3;
			return result;	
		}
	
	
		//3. 리턴값이 void 매개변수 String article 이름은 printArticle
	
		public static void printArticle (String article) {
			System.out.println(article);
		}
	
		//4. 1~3까지 만든 함수를 직접 호출해보세요 (stack 메모리 구조
	
} // end of class
