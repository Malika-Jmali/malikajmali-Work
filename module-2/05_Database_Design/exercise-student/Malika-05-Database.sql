begin TRANSACTION;
create table departments (
id serial,
name varchar(200) not null unique,
constraint pk_departments_id primary key (id)
);
create table job_titles (
id serial,
title varchar(200),
constraint pk_job_titles_id (id)
);
create table employees (
id serial,
first_name varchar(200) not null
last_name varchar(200) not null
gender char(10),
birthday date,
hireday date not null,
department_id integer not null,
job_titles_id integer not null,
constraint pk_departments_id primary key (id)
constraint fk_job_titles_id foreign key (job_titles_id) references job_titles(id),
constraint fk_departments_id foreign key (departments_id) references departments(id)
);
insert into departments (name) values ('Human Resources departments');
insert into departments (name) values ('Finance departments');
insert into departments (name) values ('Project Management departments');
insert into departments (name) values ('Reasearch and Development departments');
insert into job_titles (title) values ('Director');
insert into job_titles (title) values ('Manager');
insert into job_titles (title) values ('Associate');
insert into job_titles (title) values ('Developer');
insert into employees (first_name,last_name,hireday,departments_id,job_titles_id) values ('Mickey','Mouse','2001-01-01',8,1);
insert into employees (first_name,last_name,hireday,departments_id,job_titles_id) values ('Donald','Duck','2002-01-01',5,3);
insert into employees (first_name,last_name,hireday,departments_id,job_titles_id) values ('Daisy','Duck','2003-01-01',5,3);
insert into employees (first_name,last_name,hireday,departments_id,job_titles_id) values ('Minnie','Mouse','2004-01-01',8,2);
insert into employees (first_name,last_name,hireday,departments_id,job_titles_id) values ('Beaver','Bird','2005-01-01',6,4);
insert into employees (first_name,last_name,hireday,departments_id,job_titles_id) values ('Goose','Duck','2006-01-01',6,3);
insert into employees (first_name,last_name,hireday,departments_id,job_titles_id) values ('Otter','Moo','2007-01-01',7,4);
insert into employees (first_name,last_name,hireday,departments_id,job_titles_id) values ('Squirrel','Goo','2008-01-01',7,1);
insert into projects (name,employees_id,startdate) values ('Tall',6,'2021-06-12');
insert into projects (name,employees_id,startdate) values ('Dark',9,'2021-06-12');
insert into projects (name,employees_id,startdate) values ('And',7,'2021-06-12');
insert into projects (name,employees_id,startdate) values ('Handsome',8,'2021-06-12');
SELECT * FROM job_titles
SELECT * FROM departments
SELECT * FROM employees
SELECT * FROM projects
 ROLLBACK;
 COMMIT;