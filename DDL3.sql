create database music;

use music;

create table musicdetails(song_name varchar(10),
file_format char(10),
ratings float,
file_size double,
total_collection bigint,
total_listeners bigint,
release_date date,
singer_name varchar(7),
language char(10),
duration_in_sec int);

desc musicdetails;