create database patient;


use patient;

create table patientdetails(name varchar(20),
weight float,
success_rate double,
address char(10),
ID_num bigint,
appointment_date date,
total_cost int);

desc patientdetails;