package io_ex.ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

/*
 * @author 천병재
 * 바이트 단위 출력스트림 -3
 * a-z한꺼번에 파일에 쓰기
 */

public class MainTest3 {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("output_b.txt");

		try (fos) {
			byte[] bs = new byte[26];
			byte date = 65;
			for (int i = 0; i < bs.length; i++) {
				bs[i] = date;
				date++;
			}
			fos.write(bs,2,10); //배열을 한꺼번에 출력하기 
			fos.write(bs,2,10);
			fos.flush(); // 출력 버퍼를 비울 때 사용
			fos.write(bs,2,10);
		} catch (Exception e) {

		}
		System.out.println("출력완료");
	}

}
