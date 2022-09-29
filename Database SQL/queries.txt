SELECT * FROM customer WHERE name = 'John';
SELECT * FROM job WHERE job_title = 'Casheer';
SELECT * FROM equipment WHERE itemID = 1;
SELECT * FROM employee WHERE manager_id = 1;
SELECT * FROM employee WHERE job_job_id = 1;

SELECT salary_amount,
CASE WHEN salary_amount <=15000 THEN
'UNDERPAID'
WHEN salary_amount >=16000 THEN
'OVERPAID'
ELSE 'OK'
END AS "Salary Status"
FROM salary WHERE ROWNUM < 2;
