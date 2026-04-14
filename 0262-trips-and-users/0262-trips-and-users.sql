# Write your MySQL query statement below
SELECT 
    t.request_at AS Day,
    ROUND(SUM(IF(t.status != 'completed', 1, 0)) / COUNT(*), 2) AS `Cancellation Rate`
FROM Trips t
join Users c on t.client_id = c.users_id and c.banned = 'No'
join Users d on t.driver_id = d.users_id and d.banned = 'No'
where request_at between '2013-10-01' and '2013-10-03'
group by request_at;