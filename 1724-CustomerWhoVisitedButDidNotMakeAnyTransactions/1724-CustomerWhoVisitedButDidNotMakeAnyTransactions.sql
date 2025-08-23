-- Last updated: 8/23/2025, 6:49:35 PM
SELECT customer_id, COUNT(*) AS count_no_trans
FROM Visits v
LEFT JOIN Transactions t ON v.visit_id = t.visit_id
WHERE t.visit_id IS NULL
GROUP BY customer_id
ORDER BY count_no_trans DESC;