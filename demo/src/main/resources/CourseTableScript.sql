drop schema course_student;

create schema course_student;

use course_student;


CREATE TABLE Student (
    student_id INT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    
    PRIMARY KEY (student_id)
);

insert into Student values(1,'Otis','Milbarn');

insert into Student values(2,'Eric','Joseph');

insert into Student values(3,'Nancy','jonson');

select * from Student;



CREATE TABLE Course (
    course_id VARCHAR(50) NOT NULL,
    course_name VARCHAR(50) NOT NULL,
    teacher_id INT,
   
    PRIMARY KEY (course_id)) ;


insert into Course values('C101','AI',1);
insert into Course values('C102','APN',2);
insert into Course values('C103','CND',3);




Select * from Course;

create table Teacher(

teacher_id int primary key,

first_name varchar(50),

last_name varchar(50)


);

insert into Teacher values(1,'Tom','Joseph');

insert into Teacher values(2,'Ajinkya','Bade');

Select * from Teacher;




create table course_student (

student_id integer,

course_id VARCHAR(50),

primary key (student_id,course_id)

);

select * from course_student;



create table course_teacher (

course_id VARCHAR(50),

teacher_id integer,

primary key(course_id,teacher_id)

);

select * from course_teacher;
