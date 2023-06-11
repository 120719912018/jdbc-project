
   select * from employees;

   select JOB_ID,avg(SALARY) ,count(*)  from EMPLOYEES group by JOB_ID having  avg(SALARY) >5000;

   select  DEPARTMENT_ID,count(*)  from EMPLOYEES group by  DEPARTMENT_ID having COUNT(*) >5;

   select FIRST_NAME ,count(*)  countall from EMPLOYEES group by FIRST_NAME having count(*)>1;

