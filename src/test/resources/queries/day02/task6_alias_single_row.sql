select * from employees;

   select  salary *12 newSalary from EMPLOYEES;

select (FIRST_NAME || LAST_NAME) as fullname  from EMPLOYEES;

select (EMAIL || '@gmail.com') as full_email  from EMPLOYEES;

select concat(EMAIL , '@gmail.com') as full_email  from EMPLOYEES;

select lower(EMAIL || '@gmail.com') as full_email  from EMPLOYEES;

select UPPER(EMAIL || '@gmail.com') as full_email  from EMPLOYEES;

select initcap(EMAIL || '@gmail.com') as full_email  from EMPLOYEES;

   select EMAIL, length(EMAIL) from EMPLOYEES order by length(EMAIL) desc;

select  FIRST_NAME, length(FIRST_NAME) from EMPLOYEES order by length(FIRST_NAME);

  select FIRST_NAME from EMPLOYEES;
select FIRST_NAME, substr(FIRST_NAME,1,4) from EMPLOYEES;

select substr(FIRST_NAME,0,1) || '.' || substr(LAST_NAME,0,1) as INITIALS from EMPLOYEES;
select  FIRST_NAME from EMPLOYEES where length(FIRST_NAME)=3;