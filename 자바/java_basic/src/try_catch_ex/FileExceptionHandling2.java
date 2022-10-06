package try_catch_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileExceptionHandling2 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		Scanner scanner = new Scanner(System.in);

		try {
			fis = new FileInputStream("temp");
			System.out.println("ok");
			return;
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("오류");
		} catch (Exception e) {
			System.out.println("잘못된 사용입니다.");
		} finally {
			// 항상 수행
			// 심지어 리턴을 만나도 수행이 된다.
			try {
				fis.close();
			} catch (IOException e) {
			}
			System.out.println("항상수행이 됩니다.");
		}

		System.out.println("비정상 종료가안됨");
	}

}
