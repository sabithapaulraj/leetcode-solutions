-- Last updated: 8/23/2025, 6:49:49 PM
SELECT
    CASE WHEN e_uni.unique_id IS NOT NULL THEN e_uni.unique_id ELSE NULL END AS unique_id,
    e.name
FROM Employees e
LEFT JOIN EmployeeUNI e_uni
    ON e.id = e_uni.id
ORDER BY e.id;