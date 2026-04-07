# Write your MySQL query statement below
select d.name as Department, e.name as Employee, e.salary as Salary 
from (
    SELECT 
        *,
        DENSE_RANK() OVER (
            PARTITION BY departmentId 
            ORDER BY salary DESC
        ) AS rnk
    FROM Employee
) e
join Department d 
on e.departmentId = d.id
where e.rnk <= 3;