/*
SQL - crud
데이터 생성 -- insert
데이터 조회 -- select
데이터 삭제 -- delete
데이터 수정 -- update
조건절 --> where 컬럼명

*/
use shopdb;
desc memberTBL;

-- 데이터 생성하기
-- insert -1
INSERT INTO memberTBL (memberId, memberName, memberAddress) 
VALUES("Dang", "당탕이", "경기도 부천시");

-- insert -2 : 순서대로, 컬럼을 전부 작성하려면 생략 가능하다 !!
INSERT INTO memberTBL 
VALUES("Han", "한주연", "부산시 해운대구");

-- insert -3 순서도 지정가능함
INSERT INTO memberTBL (memberAddress, memberName, memberId) 
VALUES("Dang", "당탕이", "경기도 부천시");

-- insert -4 
INSERT INTO memberTBL (memberId, memberName ) 
VALUES("abc", " 당탕이");

-- 데이터 삭제하기
DELETE FROM memberTBL; -- 전체 삭제

-- 한건만 데이터를 삭제하고 싶을 때
-- where 조건절 + 컬럼명 = '컬럼값'

DELETE FROM memberTBL
WHERE memberAddress = "Dang";





-- 데이터 조회하기 -1 전체조회
SELECT * FROM memberTBL;

-- 데이터 조회하기 -2  선택조회 
SELECT * FROM memberTBL
WHERE memberId = 'Han';


-- 데이터 수정하기
UPDATE memberTBL SET memberName = "야스오"; 

-- 데이터 수정하기 -2
UPDATE memberTBL SET memberName = '홍길동'
WHERE memberId = 'abc';

