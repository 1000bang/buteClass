package io_ex.ch05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainTest2 {
	public static void main(String[] args) {
		String text = "text text";
		String fileName = "result.txt";
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		try {
			fileWriter = new FileWriter(fileName);
			bufferedWriter = new BufferedWriter(fileWriter);
			// 파일에 문자쓰기
			bufferedWriter.write(text);
			bufferedWriter.flush(); // 버퍼드 라이터 사용시 flush()권장

			bufferedWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 자원을 받을 때는 생성에 반대로
			try {
				bufferedWriter.close();
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
