SELECT
    firstName,
    lastName,
    city,
    state
FROM Person a
LEFT OUTER JOIN Address b
ON a.personId = b.personId
;
