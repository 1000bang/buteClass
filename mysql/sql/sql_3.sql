/*
	테이블 스키마를 수정해보자
    alter
    
*/


USE shopdb;

DESC productTBL ;

-- 컬럼 삭제하기 
ALTER TABLE productTBL DROP makeDate;
ALTER TABLE productTBL DROP company;

INSERT INTO productTBL 
VALUES(1, "컴퓨터", 100, 17);

INSERT INTO productTBL 
VALUES(2, "세탁기", 20, 3);

INSERT INTO productTBL 
VALUES(3, "냉장고", 50, 22);


SELECT * FROM productTBL;
--  컬럼명으로만 보고싶을 때 
SELECT productName FROM productTBL;

DELETE FROM productTBL
WHERE productId = 3;