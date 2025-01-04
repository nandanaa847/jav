create database watch;

use watch;

create table watchdetails(brand varchar(10),
warranty char(10),
weight float,
ratings double,
order_ID bigint,
delivery_date date,
price int,
color varchar(7),
water_resistance char(10),
display varchar(10));

desc watchdetails;
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

use watch;

alter table watchinformation drop column order_ID;
alter table watchinformation drop column ratings;

desc watchinformation;

use music;

alter table songdetails drop column file_format;
alter table songdetails drop column file_size;

desc songdetails;

use employee;

alter table employeedetails drop column email;
alter table employeedetails drop column salary_date;

desc employeedetails;
