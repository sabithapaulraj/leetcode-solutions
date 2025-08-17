-- Last updated: 8/17/2025, 8:39:00 PM
SELECT "Low Salary" AS category,
       sum(income < 20000) AS accounts_count
  FROM Accounts

UNION

SELECT "Average Salary" AS category,
       sum(income BETWEEN 20000 AND 50000) AS accounts_count
  FROM Accounts

UNION

SELECT "High Salary" AS category,
       sum(income > 50000) AS accounts_count
  FROM Accounts;