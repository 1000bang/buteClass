package io_ex.ch06;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentMainTest {
	public static void main(String[] args) {

		// 기반스트림 준비 -> 보조스트림
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("fos.txt");
			oos = new ObjectOutputStream(fos);
			Student student =  new Student("홍길동", "010-1234-1234", 10);
			oos.writeObject(student);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}