
   select * from employees;
    select FIRST_NAME, HIRE_DATE from EMPLOYEES
                     where HIRE_DATE='2003-06-17';


   SELECT FIRST_NAME, HIRE_DATE
   FROM EMPLOYEES
   WHERE HIRE_DATE = TO_DATE('17-06-2003', 'DD-MM-YYYY');


    select * from EMPLOYEES where SALARY=14000;

  select distinct salary from EMPLOYEES order by salary asc;


   select distinct SALARY from EMPLOYEES  order by SALARY asc;

   select max(SALARY) from (select distinct SALARY
                            from EMPLOYEES  order by SALARY asc)
   where ROWNUM<4;

   select * from (select max(SALARY)
                            from EMPLOYEES  order by SALARY asc)
   where ROWNUM<4;


  select * from employees;



