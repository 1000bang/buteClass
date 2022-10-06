package ch20;

public class StringTest3 {
	public static void main(String[] args) {

		// StringBuilder, StringBuffer
		// 내부적으로 가변적인 캐릭터 배열(char[])을 멤버변수로 가진다.
		// 문자열을 여러번 연결하거나 변경할 때 사용하면 유용하다.

		// StringBuffer 은 멀티쓰레드 프로그레밍에서 동기화를 보장한다.  (그냥 이거 쓰면됨 )
		// 단일 쓰레드 프로그램에서는 StringBuilder를 권장한다.

		String java = new String("java");
		String android = new String("android");

		System.out.println(java + android);
		//데이터타입이 string인 변수를 넣어줌 
		StringBuilder builder = new StringBuilder(java);
		System.out.println(System.identityHashCode(builder));
		// 2104457164

		builder.append(android);
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		// 2104457164

		// 새로생성하지 않고 수정함을 알 수 있음

		String result = builder.toString();
		System.out.println("result : " + result);
		// 문자열 넣어줌
		StringBuffer buffer = new StringBuffer("abc");
		buffer.append("d");
		buffer.append("e");

	}

}
