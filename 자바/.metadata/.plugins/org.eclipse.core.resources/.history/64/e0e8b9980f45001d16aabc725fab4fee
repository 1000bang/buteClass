package com.boot.companay;
//UserInfoCilent 코드 개발자는	인터페이스만 보고 코드 구현

public class UserInfoCilent {

	// DBTYPE mysql
	public static final String DB_TYPE = "ORACLE";

	// 코드의 시작점 메인쓰레드
	public static void main(String[] args) {

		// 사용자한테 User정보를 받습니다.
		UserInfo userInfo = new UserInfo("1", "1234", "이순신");

		// 인터페이스를 활용하는 방법
		// IUserInfoDao 하위 클래스에 있는 애들을 불러올 수 있음
		IUserInfoDao dao;
		// 1. 만약 dbtype이 Mysql이라면 또는 oracle이라면 mssql이라면
		if (DB_TYPE.equals("MYSQL")) {
			dao = new UserInfoMySqlDao();
		} else if (DB_TYPE.equals("ORACLE")) {
			dao = new UserInfoOracleDao();
		} else {
			dao = new UserInfoMsSqlDao();
		}
		//기능의 표준화 + 명세 
		// 1.사용자 정보를 저장해주세요
		dao.insertUserInfo(userInfo);
		System.out.println("----------");

		// 2. 사용자정보를 수정
		dao.updateUserInfo(userInfo);
		System.out.println("----------");
		// 3.사용자 정보 삭제
		dao.deleteUserInfo(userInfo);
		System.out.println("----------");
		
		//4. 아이디 조회
		dao.selectUserInfo("5");
		System.out.println("----------");
		
	}// end of main

}// end of class
