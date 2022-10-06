package com.boot.companay;

//DB쪽 연결 개발자는 UserInfoDao 인터페이스만 보고 기능을 구현할 수 있다.
public class UserInfoMySqlDao implements IUserInfoDao {

	// db쪽개발자는 inser,update.delete기능을 만들어주면 된다는 것을 알 수 있음
	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("MYSQL : 저장하기 - 이름 : " + userInfo.getName());
		System.out.println("MYSQL : 저장하기 - ID : " + userInfo.getId());
		System.out.println("MYSQL : 저장하기 - PW : " + userInfo.getPw());

	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("MYSQL : 수정하기 - 이름 : " + userInfo.getName());
		System.out.println("MYSQL : 수정하기 - ID : " + userInfo.getId());
		System.out.println("MYSQL : 수정하기 - PW : " + userInfo.getPw());

	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("MYSQL : 삭제하기 - 이름 : " + userInfo.getName());
		System.out.println("MYSQL : 삭제하기 - ID : " + userInfo.getId());
		System.out.println("MYSQL : 삭제하기 - PW : " + userInfo.getPw());

	}

	@Override
	public void selectUserInfo(String id) {
		System.out.println("MYSQL : 사용자 정보 조회 - Id : " + id);

	}
}