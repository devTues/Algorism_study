-- 코드를 입력하세요
SELECT I.ANIMAL_ID,	I.NAME
FROM ANIMAL_INS I
JOIN ANIMAL_OUTS O
ON O.ANIMAL_ID = I.ANIMAL_ID
WHERE I.DATETIME > O.DATETIME
ORDER BY I.DATETIME ASC