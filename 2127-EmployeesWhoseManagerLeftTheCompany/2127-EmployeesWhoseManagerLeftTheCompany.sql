-- Last updated: 8/17/2025, 8:38:55 PM
SELECT 
    e.employee_id
FROM 
    Employees e
WHERE 
    e.salary < 30000
    AND e.manager_id IS NOT NULL
    AND e.manager_id NOT IN (SELECT employee_id FROM Employees)
ORDER BY 
    e.employee_id;