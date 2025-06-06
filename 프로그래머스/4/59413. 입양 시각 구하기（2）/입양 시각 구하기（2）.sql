WITH RECURSIVE HOUR_NUM AS (
    SELECT 0 AS HOUR
    UNION ALL
    SELECT HOUR +1 FROM HOUR_NUM WHERE HOUR<23
)
SELECT H.HOUR, IFNULL(A.COUNT,0) AS COUNT
FROM HOUR_NUM H
    LEFT JOIN (SELECT HOUR(DATETIME) AS 'HOUR', COUNT(*) AS 'COUNT'
        FROM ANIMAL_OUTS 
        GROUP BY HOUR(DATETIME)) AS A
    ON H.HOUR = A.HOUR
ORDER BY H.HOUR