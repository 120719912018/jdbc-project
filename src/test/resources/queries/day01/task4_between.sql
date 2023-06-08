
   select FIRST_NAME,LAST_NAME from employees where SALARY>3000 and SALARY<6000 ;

   select FIRST_NAME,LAST_NAME,SALARY from employees where  SALARY between  3000 and 6000;

   select FIRST_NAME,LAST_NAME,SALARY from employees where  SALARY in (3000,6000,4000);

   select * from employees where  JOB_ID='IT_PROG' or JOB_ID='SA_REP';
