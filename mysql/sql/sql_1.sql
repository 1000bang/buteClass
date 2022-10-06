
/*
1. 데이터 베이스 생성, 삭제
2. 테이블 생성
3. 테이블 구조 확인
*/

-- 1. 데이터베이스 생성
-- 가능한 대소문자를 구분해서 습관화하자
-- 데이터베이스 생성 쿼리 
CREATE DATABASE shopdb;
-- 데이터베이스 삭제쿼리 
-- DROP DATABASE shopdb;

-- 테이블 생성하기
CREATE TABLE memberTBL(
	memberId char(8) not null, 
    memberName char(5) not null,
    memberAddress char(20),
    primary key(memberId)
);

-- 테이블 구조 확인 명령어
desc memberTBL;

-- 제품테이블
CREATE TABLE productTBL(
productId int not null,
productName char(4) not null,
cost int not NULL,
MakeDate date,
company char(5),
amount int,
primary key (productId)
);

desc productTBL;

CREATE DATABASE shopdb_ex1;
CREATE TABLE customertbl(
customename char(5) not null,



);