-- Last updated: 8/23/2025, 6:49:52 PM
(SELECT name AS results 
 FROM Users 
 JOIN MovieRating ON Users.user_id = MovieRating.user_id 
 GROUP BY name 
 ORDER BY COUNT(*) DESC, name ASC 
 LIMIT 1)

UNION ALL

(SELECT title AS results 
 FROM Movies 
 JOIN MovieRating ON Movies.movie_id = MovieRating.movie_id 
 WHERE created_at BETWEEN '2020-02-01' AND '2020-02-29' 
 GROUP BY title 
 ORDER BY AVG(rating) DESC, title ASC 
 LIMIT 1);
