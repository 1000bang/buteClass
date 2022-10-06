package io_ex.ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * @author 천병재
 * 출력스트림 
 * 바이트 단위출력
 * 파일에 한 바이트 씩 쓰기 -1
 */

public class MainTest1 {

	public static void main(String[] args) {
		//지역변수는 초기화햏줘야 컴파일 오류에서 벗어난다. 
		// 함수안에 사용하는 변수는 지역변수 - 초기화값을 넣ㅎ어주는게 좋다(습관)
		FileOutputStream fos = null;
		try {
			//만약 파일 없다면 자동으로 파일을 만들어준다.
			fos = new FileOutputStream("output_a.txt");
			fos.write(65);
			fos.write(66);
			fos.write('c');
			fos.write('D');
			fos.write('e');
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
