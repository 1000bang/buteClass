/*

	@author 천병재
    문제 5
	fruit 데이터베이스를 생성해보자. fruit의 데이터들인
    순서(order), 이름(Name), 가격 (price)을 테이블로 생성하시오. 
    (단, 순서는 중복 불가능하며 한자리 수만 입력 가능합니다.) 
    
*/

CREATE DATABASE fruit;

CREATE TABLE orderTBL(
	orderNum int(1) not null,
	primary key(orderNum) 
);
CREATE TABLE nameTBL(
	fruitName char(10) not null 
);
CREATE TABLE priceTBL(
	fruitPrice int 
);

desc orderTBL;
desc nameTBL;
desc priceTBL;