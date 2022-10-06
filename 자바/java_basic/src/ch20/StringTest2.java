package ch20;

public class StringTest2 {
	public static void main(String[] args) {

		// 상수풀에 한번 생성된 String은 불변이다 (immutable)
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(System.identityHashCode(str1));
		
		//상수풀에 새로 만들어짐 -- immutable
		str1 = str1 + "d";
		System.out.println(System.identityHashCode(str1));
		System.out.println(str1 == str2);
		System.out.println(str1);

	}

}
