use watch;

rename table watchdetails to watchinformation;

use music;

rename table musicdetils to songdetails;

use bankaccount;

drop table accountdetails;

use watch;

alter table watchinformation add column emi int;
alter table watchinformation add column material varchar(20);
alter table watchinformation add column movement char(7);
alter table watchinformation add column watch_code varchar(20);

desc watchinformation;

use music;

alter table songdetails add column budget int;
alter table songdetails add column album_name varchar(20);
alter table songdetails add column state char(7);
alter table songdetails add column genre varchar(20);

desc songdetails;

use employee;

alter table employeedetails add column department_ID bigint;
alter table employeedetails add column department_name varchar(20);
alter table employeedetails add column manager_ID char(7);
alter table employeedetails add column manager_name varchar(20);

desc employeedetails;