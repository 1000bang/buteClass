package io_ex.ch06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentMainTest2 {
	public static void main(String[] args) {

		// 기반스트림 준비 -> 보조스트림
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("fos.txt");
			ois = new ObjectInputStream(fis);
			// student클래스를 선언하고/ 리드오브젝트를 대입 /Student 클래스로 다운캐스팅
			Student s1 = (Student) ois.readObject();
			System.out.println(s1.toString());
			// transient 는 제외되서 출력되는것을 확인할 수 있다

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				//파일 닫기
				ois.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
