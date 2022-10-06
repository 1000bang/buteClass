package io_ex.ch05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainTest1 {
	public static void main(String[] args) {

		
		try {
			File file  = new File("mytext_1.txt");
			FileReader reader = new FileReader(file); //기반스트림 
			//한줄 씩 읽게 만들고 싶다 ! - 보조스트림
			
			BufferedReader bufferedReader = new BufferedReader(reader);
			//보조 스트림 생성시 매개변수로 기반스트림을 넣고있다
			int count = 0;
			String line;
			try {
//				while((line = bufferedReader.readLine()) != null ) {  //null 하면 스트링line값 대입안해도 되는듯
//					System.out.println(line);
//					count ++;
//				}
				int i = 0;
				while((i = reader.read()) != -1l ) {  //null 하면 스트링line값 대입안해도 되는듯
					System.out.print((char)i);
					count ++;
				}
				System.out.println("\n"+count);
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
}
