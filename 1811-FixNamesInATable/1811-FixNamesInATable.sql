-- Last updated: 8/23/2025, 6:49:28 PM
SELECT 
    user_id,
    CONCAT(UPPER(SUBSTRING(name, 1, 1)), LOWER(SUBSTRING(name, 2))) AS name
FROM 
    Users
ORDER BY 
    user_id;