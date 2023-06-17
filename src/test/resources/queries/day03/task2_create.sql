
select * from employees;

  CREATE TABLE loopteam
  (
      empId     INTEGER PRIMARY KEY,
      firstname varchar(10) not null,
      jobtitle  varchar(20) not null,
      age       INTEGER,
      salary    INTEGER
  );

SELECT * FROM loopteam;

   update  loopteam
   set salary= salary+10000 where jobtitle='SDET';

 delete from loopteam
 where empId=1;

 select * from loopteam;