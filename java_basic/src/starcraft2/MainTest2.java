package starcraft2;

public class MainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = new int[3]; 
		double numbers2[] = new double[3];
		
		
		System.out.println(numbers[2]);
		System.out.println(numbers2[2]);
	
		//오류확인' 배열의크기 3 인덱스 마지막 번호 2
		//배열을 사용할 때 인덱스의 크기와 배열의 길이를 잘 확인해야한다. 
		//System.out.println(numbers[3]);
		
		//필요에 따라서 배열선언과 동시에 초기화를 직접할 수 있다.
		//String != String[] 완전 다른 데이터 타입입니다. 
		String[] strArr1 = new String[] {"안","녕","하"};
		String[] strArr2 = new String[] {"반","가","워"};
		System.out.println(strArr1[0]);
		int[] intArr1 = {10, 20, 101}; //new 데이터타입[] 생략가능 
		System.out.println(intArr1[2]);
		
		
	}

}
