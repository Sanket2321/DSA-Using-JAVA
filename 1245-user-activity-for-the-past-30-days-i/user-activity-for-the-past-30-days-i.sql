# Write your MySQL query statement below
#select activity_date as day ,count(activity_type) as active_user from #Activity group by(activity_date) limit 2;


SELECT activity_date AS day, COUNT(DISTINCT user_id) AS active_users
FROM Activity
WHERE (activity_date > "2019-06-27" AND activity_date <= "2019-07-27")
GROUP BY activity_date;