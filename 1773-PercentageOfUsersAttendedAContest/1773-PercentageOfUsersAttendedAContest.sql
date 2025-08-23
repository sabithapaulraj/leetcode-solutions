-- Last updated: 8/23/2025, 6:49:32 PM
SELECT 
    contest_id,
    ROUND(COUNT(DISTINCT user_id) * 100.0 / (SELECT COUNT(*) FROM Users), 2) AS percentage
FROM 
    Register
GROUP BY 
    contest_id
ORDER BY 
    percentage DESC,
    contest_id ASC;