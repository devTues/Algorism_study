-- 코드를 입력하세요
SELECT
car_id
,ROUND(SUM(datediff(end_date,start_date)+1)/count(car_id),1) AS AVERAGE_DURATION
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY 1
HAVING ROUND(SUM(datediff(end_date,start_date)+1)/count(car_id),1)>=7
ORDER BY 2 DESC,1 DESC