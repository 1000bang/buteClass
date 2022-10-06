package ch20;

public class StringTest1 {
	public static void main(String[] args) {
		// string 선언방식
		// heap 메모리 인스턴스로 생성하는 경우

		String str1 = new String("abc"); //heap메모리에 new
		String str2 = "abc"; //상수 풀영역 

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		//다른공간안에 객체가 생성되어짐을 알 수 있다. 
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	}

}
