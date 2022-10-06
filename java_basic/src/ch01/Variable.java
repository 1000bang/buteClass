package ch01;

public class Variable {

	//코드의 시작점
	public static void main(String[]args) {
		int age;
		int count;
		
		age = 1; //초기화 한다 (값을 넣다)
		count = 100;
		
		System.out.println(age);
		System.out.println("===============");
		System.out.println(count);
		
		//변수는 변하는 수입니다.
		age = 1000;
		System.out.println(age);
		
		//변수 선언과 동시에 초기화 하기
		int level = 100;
		level = 3;
		System.out.println(level);
		

	}  //end of  main
}//end of class