SELECT 
    a.id AS Id  
FROM 
    Weather a
    INNER JOIN Weather b
    ON a.recordDate = DATE_ADD(b.recordDate, INTERVAL 1 DAY)
    AND a.temperature > b.temperature
;
