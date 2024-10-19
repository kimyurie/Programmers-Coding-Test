-- https://school.programmers.co.kr/learn/courses/30/lessons/59043
SELECT a.ANIMAL_ID, a.NAME
FROM
    ANIMAL_INS a JOIN ANIMAL_OUTS b
    ON a.ANIMAL_ID = b.ANIMAL_ID
WHERE a.DATETIME > b.DATETIME
ORDER BY a.DATETIME ASC;