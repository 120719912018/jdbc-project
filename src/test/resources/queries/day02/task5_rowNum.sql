

select * from employees;

  select  distinct SALARY,FIRST_NAME,LAST_NAME,DEPARTMENT_ID  from EMPLOYEES where ROWNUM<6  order by SALARY desc;

select  * from (select * from EMPLOYEES order by SALARY desc ) where ROWNUM<6;  --order by SALARY desc;

select distinct * from (select  * from EMPLOYEES order by SALARY desc ) where ROWNUM<53;

select  min(SALARY) from (select  * from EMPLOYEES order by SALARY desc ) where ROWNUM<6;

select * from EMPLOYEES where SALARY=(select  min(SALARY) from (select  * from EMPLOYEES order by SALARY desc ) where ROWNUM<6);


select  min(SALARY) from (select  distinct SALARY from EMPLOYEES order by SALARY desc) where ROWNUM <6;

select  * from EMPLOYEES
          where SALARY=(select min(salary) from (select  distinct SALARY from EMPLOYEES order by SALARY desc) where ROWNUM <6);