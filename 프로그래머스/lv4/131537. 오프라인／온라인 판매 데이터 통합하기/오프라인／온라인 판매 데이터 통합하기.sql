SELECT *
FROM
(
SELECT
    date_format(SALES_DATE, '%Y-%m-%d') as SALES_DATE,
    PRODUCT_ID, USER_ID, SALES_AMOUNT
FROM
    online_sale
WHERE
    date_format(SALES_DATE, '%Y-%m') like '2022-03%'

UNION ALL

SELECT
    date_format(SALES_DATE, '%Y-%m-%d') as SALES_DATE,
    PRODUCT_ID,
    CASE
    WHEN OFFLINE_SALE_ID is not null then null
    END AS USER_ID,
    SALES_AMOUNT
FROM
    OFFLINE_SALE
WHERE
    date_format(SALES_DATE, '%Y-%m') like '2022-03%'
    ) as table2
ORDER BY
    SALES_DATE, PRODUCT_ID, USER_ID