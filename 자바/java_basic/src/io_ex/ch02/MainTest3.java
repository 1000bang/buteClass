package io_ex.ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/*
 * @author 천병재
 * 입력스트림 - file
 * 문자 단위로 사용
 * 1.7버전 이상부터 오토클로즈 
 */

public class MainTest3 {

	public static void main(String[] args) {

		//한번에 10글자씩 배열단위로 읽을 수 있다
		byte[] bs = new byte[10];
		InputStream inputstream;
		try (FileInputStream fis = new FileInputStream("boot_a.txt")) {
			int i;
//			while ((i = fis.read(bs)) != -1) {
				while ((i = fis.read(bs, 1, 7)) != -1) {
//				System.out.print((char)fis.read());
//				System.out.print((char)i);
				for(int j = 0; j < i; j ++) {
					System.out.print((char)bs[j]);
				}
				System.out.println("i : " + i + "바이트씩 읽음");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
