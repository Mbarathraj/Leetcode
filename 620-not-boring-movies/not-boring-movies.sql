# Write your MySQL query statement below
-- select * from cinema where id%2!=0 and description!="boring" order by rating desc
# Write your MySQL query statement below
select * from Cinema where id%2=1 and description <> 'boring' order by rating DESC