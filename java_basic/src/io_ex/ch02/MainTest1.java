package io_ex.ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * @author 천병재
 * 입력스트림 
 * 파일에서 한바이트 씩 자료 읽기 1byte 한글은 2byte임
 */

public class MainTest1 {

	public static void main(String[] args) {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("boot_a.txt");
			System.out.print((char) fis.read());
			System.out.print((char) fis.read());
			System.out.print((char) fis.read());
			System.out.print((char) fis.read());
			System.out.print((char) fis.read());
			System.out.print((char) fis.read());
			// 입출력은 한번 읽으면 포커스가 다음으로 이동함
		} catch (FileNotFoundException e) { // 파일이 없을 때 예외
			e.printStackTrace();
		} catch (IOException e) { // 리드할 때 예외
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch(NullPointerException e) {
				System.out.println("null포인터 객체생성 주소값 확인");
			}
			
		}

	}

}
