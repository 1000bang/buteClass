/*

	@author 천병재
    문제 1
	컴퓨터의 가격이 200만원으로 올랐습니다.
    컴퓨터의 정보를 새로 추가 해주고 재고는 10개가 남았습니다.
    모든 컴퓨터의 가격을 200만원으로 수정해주세요.
    
*/
DESC productTBL;
SELECT * FROM productTBL;

-- 1-1
UPDATE productTBL SET cost = 200
WHERE productName = '컴퓨터';

-- 1-2
INSERT INTO productTBL 
VALUES(4, "컴퓨터", 100, 10);

INSERT INTO productTBL 
VALUES(5, "컴퓨터", 800, 10);

INSERT INTO productTBL 
VALUES(6, "컴퓨터", 300, 10);


-- 1-3
UPDATE productTBL SET cost = 200
WHERE productName = '컴퓨터';

/*

    문제 3

	productTBL에 가격이 20만원인 물건만 삭제 해주세요.

    
*/

-- 3-1

SELECT * FROM productTBL;

DELETE FROM productTBL
WHERE cost = 20;
