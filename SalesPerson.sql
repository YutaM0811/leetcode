SELECT
    name
FROM
    SalesPerson
WHERE
    sales_id NOT IN(
            SELECT
                b.sales_id
            FROM
                Orders b
            INNER JOIN Company c
                ON b.com_id = c.com_id
            WHERE
                c.name = 'RED'
            );
