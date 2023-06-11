

   select  count(*)  as allEmployees from employees;

   select count(*) allcolumn  from employees;
     select   count(  distinct FIRST_NAME) from EMPLOYEES;

   select count(MANAGER_ID)  from EMPLOYEES where DEPARTMENT_ID IS NULL;

  SELECT MIN(SALARY) FROM EMPLOYEES;

   SELECT ROUND(AVG(SALARY),-2)  FROM EMPLOYEES;
   select SUM(SALARY) from EMPLOYEES;



