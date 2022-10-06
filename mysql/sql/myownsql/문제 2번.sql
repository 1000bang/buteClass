/*

	@author 천병재
    문제 2
	memberId 가 Han인 데이터의 아이디와 주소가 보이도록 조회하여 출력
    
*/


CREATE TABLE memTBL(
	memberId char(8) not null, 
    memberName char(5) not null,
    memberAddress char(20),
    primary key(memberId)
);

DESC memTBL;
SELECT * FROM memTBL;

INSERT INTO memTBL
VALUES ("Han", "한동근", "부산 해운대구");


INSERT INTO memTBL
VALUES ("Kim", "김진수", "부산 수영구");

SELECT * FROM memTBL
WHERE memberId = "Han";