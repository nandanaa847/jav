create database orders;


use orders;

create table saree(type varchar(20),
length float,
width double,
order_code char(10),
product_ID bigint,
delivery_date date,
quantity int);

desc saree;