package io_ex.ch04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

/*
 * @author 천병재
 * png도 카피 됨 
 */

public class MainTest4 {

	public static void main(String[] args) throws FileNotFoundException {

		String originFilePath = "C://Teamproject.zip";
		String copyFilePath = "copy_Teamproject.zip";

		
		try (FileInputStream fis = new FileInputStream(originFilePath)) {
			try (FileOutputStream fos = new FileOutputStream(copyFilePath)) {
				int i;
				while ((i = fis.read()) != -1) {
					//System.out.println(i);
					fos.write(i);
				}
			}
		} catch (Exception e) {

		}

	}
}
