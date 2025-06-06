SELECT CONCAT('/home/grep/src/', F.BOARD_ID,'/',F.FILE_ID,F.FILE_NAME,F.FILE_EXT) AS FILE_PATH
FROM USED_GOODS_FILE F
WHERE F.BOARD_ID = (SELECT BOARD_ID 
                    FROM USED_GOODS_BOARD B 
                    ORDER BY B.VIEWS DESC LIMIT 1)
ORDER BY FILE_ID DESC