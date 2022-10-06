package io_ex.ch01;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class MainTest1 {

	public static PrintStream out;
	public static InputStream in;
	public static PrintStream err;

	public static void main(String[] args) {
		// 모니터와 키보드는 표준입출력 스트림이라고 함
		
		//모니터에 출력하는 스트림 
		//출력 스트림 (모니터)
		System.out.println("출력스트림");

		//키보드에 값을 입력받는 스트림
		//입력 스트림(키보드)
		//System.in;
		
		try {
			int k = System.in.read();
			System.out.println("k :" + k);
			System.out.println("k :" + (char)k);
		} catch (IOException e) { //입출력이 있을 때 예외가 일어날 수 있다		
			e.printStackTrace();
		}
		
		
	}

}
