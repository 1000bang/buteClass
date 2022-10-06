package ch04;

public class WhileMainTest {

	//main thread
	//start of main
	public static void main(String[] args) {
		
		
		//1 ~ 10까지 연산
		//while문
		//while(조건식){수행문}
		//무한 반복을 조심하자
		int num = 1;
		int sum = 0; //연산의 결과값을 담을 변수선언
		
//		while(num <= 10) {
//			System.out.println("현재값 : " + num);
//			sum = sum + num;
//			num ++;	
//			// sum += num;
//			// num ++;
//			//혹은
//			// sum += num++; 이것도 되지만 가독성이 떨어짐 
//			
//			
//			//밀리세컨즈 1/1000 0.1초 동안 잠들어라;
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				
//				e.printStackTrace();
//			}
//					
//		}
//		System.out.println("연산에 대한 결과값 : " + sum);
//		
		while(num <= 10) {
			System.out.println("-" );
			try {
				//메인쓰레드 (0.01초 잠들고 일어나서 다시 수행해)
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			num ++;
		}
		System.out.println("연산에 대한 결과값 : " + sum);
		
	
	// do while문
		// 조건과 상관없이 한번은 수행문을 수행
		// 이후 조건 체크 
		
	} //end of main
}//end of class
