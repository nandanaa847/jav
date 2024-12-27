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