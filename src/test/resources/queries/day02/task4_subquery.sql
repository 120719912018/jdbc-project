

select * from employees;

   ;

  select * from EMPLOYEES where SALARY=(SELECT max(salary) from EMPLOYEES);
    --select (SELECT max(salary) from EMPLOYEES)  from

   select * from EMPLOYEES where SALARY=(SELECT max(salary) from EMPLOYEES where SALARY< (select max(SALARY) from EMPLOYEES));

   select *  from EMPLOYEES where SALARY> (select round(avg(SALARY),2) from EMPLOYEES);