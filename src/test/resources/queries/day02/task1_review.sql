
  SELECT * from DEPARTMENTS where MANAGER_ID IS NULL;

  Select MAX_SALARY from JOBS;

   select  * from LOCATIONS where COUNTRY_ID not in  ('UK','US');
   Select * from COUNTRIES where REGION_ID=1 AND COUNTRY_NAME  != 'Belgium';
   Select * from COUNTRIES where REGION_ID=1 AND COUNTRY_NAME  not in ('Belgium') ;
   select * from COUNTRIES where REGION_ID = 1 and COUNTRY_NAME not like 'Belgium';

   select  * from EMPLOYEES where DEPARTMENT_ID not in (90,60,100,130,120);

    select  count(*)  from COUNTRIES;

  select  *  from COUNTRIES;

