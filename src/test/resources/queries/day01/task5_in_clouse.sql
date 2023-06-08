
select FIRST_NAME,LAST_NAME,SALARY from employees where  SALARY in (3000,6000,4000);

select * from employees where  job_id not in('IT_PROG','SA_REP');
select CITY from LOCATIONS where COUNTRY_ID in ('IT','US','UK');

select *  from EMPLOYEES where DEPARTMENT_ID IS  NULL;

select *  from EMPLOYEES where DEPARTMENT_ID IS NOT NULL;

