package try_catch_ex;

public class ArrayExceptionHandling {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			System.out.println("오류발생");
		}
		System.out.println("비정상 종료 x");
	}

}
