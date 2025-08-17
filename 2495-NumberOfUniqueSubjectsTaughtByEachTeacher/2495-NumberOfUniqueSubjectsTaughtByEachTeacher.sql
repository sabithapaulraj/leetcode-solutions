-- Last updated: 8/17/2025, 8:38:40 PM
SELECT teacher_id,COUNT(DISTINCT subject_id) AS cnt FROM Teacher GROUP BY teacher_id ORDER BY teacher_id;