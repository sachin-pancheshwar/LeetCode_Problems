# Write your MySQL query statement below
DELETE e1 
FROM Person AS e1,Person AS e2
WHERE e1.email = e2.email
AND e1.id>e2.id