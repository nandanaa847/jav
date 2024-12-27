create database bankaccount;

use bankaccount;

create table accountdetails(account_holder_name varchar(10),
ifsc_code char(10),
balance double,
UPI_ID bigint,
mobile_num bigint,
opening_date date,
age int,
account_type varchar(7),
account_ID char(10),
transaction_limit int);

desc accountdetails;