-- Last updated: 8/23/2025, 6:49:39 PM
SELECT
    user_id,
    name,
    mail
FROM
    Users
WHERE
    mail REGEXP '^[a-zA-Z][a-zA-Z0-9._-]*@leetcode\\.com$';