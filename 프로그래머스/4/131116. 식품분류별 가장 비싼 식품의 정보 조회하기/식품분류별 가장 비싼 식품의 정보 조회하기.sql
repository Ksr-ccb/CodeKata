SELECT CATEGORY, PRICE, PRODUCT_NAME
FROM (
    SELECT CATEGORY, 
        RANK() OVER (PARTITION BY CATEGORY ORDER BY PRICE DESC) AS RANK1,
        PRICE,
        PRODUCT_NAME
    FROM FOOD_PRODUCT
    WHERE CATEGORY IN ( '과자', '국', '김치', '식용유')
         ) AS M
WHERE RANK1 = 1
ORDER BY PRICE DESC ;