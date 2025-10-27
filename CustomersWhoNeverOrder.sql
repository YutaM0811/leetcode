SELECT
    c.name AS Customers
FROM
    Customers c
    LEFT OUTER JOIN Orders o
    ON c.id = o.customerid
WHERE
o.id IS NULL
;
