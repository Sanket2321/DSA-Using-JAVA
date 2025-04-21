# Write your MySQL query statement below
 select email as Email from Person group by(email) having count(*)>1 
 #here we are using having clause because we want grouping and suppose we want filtering the record after grouping we used having 