-- 코드를 입력하세요
SELECT FOOD_TYPE
       , REST_ID
       , REST_NAME
       , FAVORITES
FROM REST_INFO
WHERE (FOOD_TYPE, FAVORITES) IN (SELECT FOOD_TYPE, MAX(FAVORITES)
                                 FROM REST_INFO
                                 GROUP BY FOOD_TYPE)
GROUP BY FOOD_TYPE
ORDER BY FOOD_TYPE DESC