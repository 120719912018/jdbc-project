

select  * from employees;

    CREATE VIEW SDET AS
    select substr(FIRST_NAME,0,1) || '.' || substr(LAST_NAME,0,1) as INITIALS,
            first_name || 'MAKES' || SALARY AS "EMPLOYEE SALARY" from employees;



   CREATE VIEW NEW_SDET AS
   select substr(FIRST_NAME,0,1) || '.' || substr(LAST_NAME,0,1) as INITIALS,
          first_name || 'MAKES' || SALARY AS "EMPLOYEE SALARY" from employees;

