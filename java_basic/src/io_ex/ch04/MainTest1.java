package io_ex.ch04;

import java.io.FileReader;
import java.io.IOException;

/*
 * @author 천병재
 * Reader 
 * 문자 단위 입력스트림
 * 
 */

public class MainTest1 {

	public static void main(String[] args) {
		// 2바이트 씩 읽어냄 (한글가능)

		try (FileReader fr = new FileReader("reader_1.txt")) {
			int i ;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (Exception e) {
			System.out.println("에러");
		}
	}

}
