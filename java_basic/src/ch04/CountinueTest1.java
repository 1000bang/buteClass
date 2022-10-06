package ch04;

public class CountinueTest1 {
	//main thread
	//start of main

	public static void main(String[] args) {
		
		//예약어 continue
		//무시하고 진행 하는 continue
		
		//final int MULTIPLE = 7;
		
		int num = 0;
		int count = 0;
		
		for (num = 1; num <= 77; num ++ ) {
			//만약 2의 배수이면 화면에 출력하시오
			
			if (num %2 == 0) {
				//System.out.println("num의 값은 " + num);
				count++;  //2의 배수의 갯수를 확인하기 위한 위치 
				//2의 배수는 출력하지마시오 
				//무시하고 진행 하는 continue 활용
				continue;
				
			}
			//count++;  for문이 몇번 반복하는지 확인
			System.out.println("num : " + num);
			
		}
		
		System.out.println("2의 배수는 "+ count + "개 입니다");
		
	} //end of main

} // end of class
