
--1. Display all first_name and department_name
  SELECT FIRST_NAME,d.DEPARTMENT_NAME FROM employees e ,DEPARTMENTS d
       WHERE e.DEPARTMENT_ID=d.DEPARTMENT_ID;
--2.Display all first_name and department_name including the  department without employee
  SELECT FIRST_NAME, DEPARTMENT_NAME FROM DEPARTMENTS D
       LEFT JOIN EMPLOYEES E ON D.DEPARTMENT_ID = E.DEPARTMENT_ID;
--3.Display all first_name and department_name including the  employee without department
  SELECT FIRST_NAME, DEPARTMENT_NAME FROM EMPLOYEES  E
      LEFT JOIN DEPARTMENTS D  ON E.DEPARTMENT_ID = D.DEPARTMENT_ID;

--4.Display all first_name and department_name
--including the  department without employee  and  employees  without departments
  SELECT FIRST_NAME, DEPARTMENT_NAME FROM EMPLOYEES  E
        FULL JOIN DEPARTMENTS D ON E.DEPARTMENT_ID = D.DEPARTMENT_ID;
--5.Display All cities and related country names
   SELECT city,COUNTRY_NAME  FROM LOCATIONS l
        JOIN COUNTRIES c ON l.COUNTRY_ID = c.COUNTRY_ID;
--6.Display All cities and related country names  including with countries without city
SELECT city,COUNTRY_NAME  FROM COUNTRIES c
                                   LEFT JOIN  LOCATIONS l ON l.COUNTRY_ID = c.COUNTRY_ID;
