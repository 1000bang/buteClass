/*

	@author 천병재
    문제 4
	1. 상가라는 데이터베이스를 만들어주세요 
    2. 상가의 테이블에는 호수, 주인, 세입자, 월세 금액, 가게명을 포함시켜 주세요
    3. 101호~ 105호 까지의 데이터를 만들어 주세요.
    4. 세입자가 바뀌는 경우를 대비해서 데이터를 바꾸는 기능을 구현 해주세요
    
*/

-- 4-1
CREATE DATABASE house;

-- 4-2
CREATE TABLE HouseTBL(
	storeNum int not null,
	owner char(5),
	adaptor char(5),
	storeCost int,
	storeName char(20),
 primary key(storeNum)
);

INSERT INTO houseTBL
VALUES (101, "유안", "병재", 500, "술나방");

INSERT INTO houseTBL
VALUES (102, "유안", "동률", 300, "술다방");

INSERT INTO houseTBL
VALUES (103, "유안", "준성", 400, "포토시그니처");

INSERT INTO houseTBL
VALUES (104, "유안", "재오", 200, "야채가게");


INSERT INTO houseTBL
VALUES (104, "유안", "승인", 1000, "벤츠");

SELECT * FROM houseTBL;

-- 4-4 update

UPDATE houseTBL SET adaptor = ""
WHERE adaptor = "";

