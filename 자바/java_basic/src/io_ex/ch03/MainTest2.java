package io_ex.ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * @author 천병재
 * 바이트 단위 출력스트림 -2
 * a-z한꺼번에 파일에 쓰기
 */

public class MainTest2 {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("output_b.txt");

		try (fos) {
			byte[] bs = new byte[26];
			byte date = 65;
			for(int i =  0; i < bs.length; i ++) {
				bs[i] = date;
				date ++;
			}
			fos.write(bs);
		} catch (Exception e) {

		}

	}

}
