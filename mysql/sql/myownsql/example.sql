/*
	@author 천병재
	문제) 
    영어점수가 100점인 사람을 찾으세요 
    
*/

DESC abcTBL;

SELECT * FROM abcTBL;

SELECT * FROM productTBL
WHERE englishScore = '100';



CREATE TABLE abcTBL(

studentName char(5) not null,
studentNum int not null,
koreanScore int,
englishScore int,
historyScore int,
scienceScore int,
averageScore int, 
primary key (studentName, studentNum)

);



INSERT INTO abcTBL (studentName, studentNum, koreanScore, englishScore, historyScore, scienceScore)
VALUES("김동률", 1, 100, 17, 80, 30);


INSERT INTO abcTBL (studentName, studentNum, koreanScore, englishScore, historyScore, scienceScore)
VALUES("박진영", 2, 50, 80, 74, 15);


INSERT INTO abcTBL (studentName, studentNum, koreanScore, englishScore, historyScore, scienceScore)
VALUES("성시경", 3, 66, 70, 15, 30);


INSERT INTO abcTBL (studentName, studentNum, koreanScore, englishScore, historyScore, scienceScore)
VALUES("잔나비", 4, 100, 77, 80, 92);


INSERT INTO abcTBL (studentName, studentNum, koreanScore, englishScore, historyScore, scienceScore)
VALUES("오혁", 5, 88, 60, 77, 78);


INSERT INTO abcTBL (studentName, studentNum, koreanScore, englishScore, historyScore, scienceScore)
VALUES("삼다수", 6, 98, 74, 95, 45);


INSERT INTO abcTBL (studentName, studentNum, koreanScore, englishScore, historyScore, scienceScore)
VALUES("이찬혁", 7, 100, 97, 98, 77);


INSERT INTO abcTBL (studentName, studentNum, koreanScore, englishScore, historyScore, scienceScore)
VALUES("송가인", 8, 33, 21, 5, 10);


INSERT INTO abcTBL (studentName, studentNum, koreanScore, englishScore, historyScore, scienceScore)
VALUES("임영웅", 9, 100, 100, 100, 97);


INSERT INTO abcTBL (studentName, studentNum, koreanScore, englishScore, historyScore, scienceScore)
VALUES("양파", 10, 66, 25, 71, 62);
