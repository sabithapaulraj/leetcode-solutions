-- Last updated: 8/17/2025, 8:39:05 PM
SELECT employee_id, department_id
FROM Employee
WHERE primary_flag = 'Y'
OR employee_id NOT IN (
    SELECT employee_id 
    FROM Employee 
    WHERE primary_flag = 'Y'
);