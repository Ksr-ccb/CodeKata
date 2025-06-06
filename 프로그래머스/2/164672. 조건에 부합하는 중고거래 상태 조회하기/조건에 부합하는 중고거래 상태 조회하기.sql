SELECT BOARD_ID,	WRITER_ID,	TITLE,	PRICE,
    CASE
        WHEN (U.STATUS = 'SALE')
            THEN '판매중'
        WHEN (U.STATUS = 'DONE')
            THEN '거래완료'
        WHEN (U.STATUS = 'RESERVED')
            THEN '예약중'
    END AS 'STATUS'
FROM USED_GOODS_BOARD AS U
WHERE DATE(CREATED_DATE) = '2022-10-05'
ORDER BY BOARD_ID DESC