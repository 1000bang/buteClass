package com.boot.companay;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//db.properties 하드에 저장된 데이터를 메모리로 가져온다 

public class UserInfoCilent2 {

	// 코드의 시작점 메인쓰레드
	public static void main(String[] args) {

		try {
			//fis상태는 파일과 연결된 상태이기 때문에 접근가능하다
			//fileinputstream 통로를 열어 한글자한글자 byte 단위로 데이터를 읽음 
			FileInputStream fis = new FileInputStream("a");
			//fis.read(); 한글자(byte단위)로 읽어서 불편함
			System.out.println("파일을 잘 찾았습니다.");
			
			//글자들을 읽는 방법은 여러가지가 있다. 
			Properties prop = new Properties();
			//데코레이션 패턴 : 기능을 추가 확장
			prop.load(fis); // =을 기준으로 읽음
			//ORACLE
			String dbType = prop.getProperty("DB_TYPE");
			System.out.println("DB_TYPE : " + dbType);
			System.out.println("-------------");
			String dbType2 = prop.getProperty("DB_TYPE2");
			System.out.println("DB_TYPE2 : " + dbType2);
			IUserInfoDao dao;
			if(dbType.equals("ORACLE")) {
				dao = new UserInfoOracleDao();
			}else if (dbType.equals("MYSQL")) {
				dao = new UserInfoMySqlDao();
			}else {
				dao = new UserInfoMsSqlDao();
			}
			
			// 1. 저장하기
			// scanner를 통해 데이터를 받고
			// 
			UserInfo userInfo = new UserInfo("110", "abc", "홍길동");
			dao.insertUserInfo(userInfo);
			
			
		} catch (IOException e) {
			//e.printStackTrace(); 어디서 오류가 났는지 추적해서 화면에 표시
			System.out.println("요청하신 파일 이름이 없네요 !!! ");
		}

	}// end of main

}// end of class
