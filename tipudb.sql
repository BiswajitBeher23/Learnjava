create database tipudb;

use tipudb;

CREATE TABLE IF NOT EXISTS `Coaching` (
    `idno` INT,
    `fullname` VARCHAR(200) NOT NULL,
    `gender` VARCHAR(100) NOT NULL,
    `email` VARCHAR(100)  NOT NULL,
    `contactnumber` bigint NOT NULL,
    `address` VARCHAR(200) NOT NULL,
    `college` VARCHAR(100) NULL,
    `dateOfjoining` DATE,
    PRIMARY KEY(`idno`, AUTOINCREMENT))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `joinee` (
    `id` INT AUTO_INCREMENT,
    `course` VARCHAR(200) NOT NULL,
    `amount` VARCHAR(100) NOT NULL,
    `batchtiming` VARCHAR(100)  NOT NULL,
    `startdate` DATE,
    PRIMARY KEY(`id`))
ENGINE = InnoDB;

show tables;

desc coaching;

alter table coaching modify dateOfjoining date not null;

alter table coaching modify contactnumber bigint not null;

insert into coaching (fullname, gender, email, contactnumber, address, college, dateOfjoining) 
values
('Avinash swain', 'male','avi234@gmail.com', '7658465789', 'patia, bhubaneswar', 'cept', '2022-11-05'),
('Sasmita patra', 'female','sasmita@gmail.com', '7896345542', 'nayapalli, bhubaneswar', 'techno', '2023-10-25'),
('Rashmi Sahoo', 'male','rashmi34@gmail.com', '9087776554', 'bhomikhal, bhubaneswar', 'abit', '2023-12-02');

/**
('Sadeep malik', 'male','sadeep@gmail.com', '6589456234', 'chandaka, bhubaneswar', 'nit', '2023-12-02'),
('Sandip sahoo', 'male','sandip@gmail.com', '7685459800', 'cuttack', 'abit', '2023-10-19'),
('Malabika patra', 'female','malbika@gmail.com', '7896457743', 'patia, bhubaneswar', 'ceb', '2024-01-05'),
*/
/**
('Biswajit Behera', 'male','biswa2024@gmail.com', '7877456678', 'meduakual, jajpur', 'ceb', '2023-11-23'),
*/

select * from coaching;

desc joinee;

alter table joinee modify startdate date not null;

insert into joinee(course, amount, batchtiming, startdate) 
values ('java', '5000', 'morning', '2023-12-02'),('web development', '3000', 'afternoon', '2023-10-19'),('python', '7000', 'evening', '2024-01-05');

select * from joinee;

select fullname as joinee, gender as gen, contactnumber as phonenummber, college, dateOfjoining as joindate from coaching;

select coaching.fullname as Student, coaching.gender, coaching.college,
joinee.course, joinee.amount, coaching.dateOfjoining 
from coaching inner join joinee on
coaching.idno = joinee.id;

select coaching.fullname as student,coaching.college,joinee.course,joinee.amount from coaching inner join joinee on 
coaching.idno=joinee.id;

select coaching.fullname as student, coaching.contactnumber, joinee.course, coaching.dateOfjoining from coaching inner join joinee on 
coaching.idno = joinee.id;

select * from coaching left join joinee on coaching.idno = joinee.id;

select * from joinee right join coaching on coaching.idno = joinee.id;

select coaching.fullname as student, coaching.contactnumber, joinee.course, coaching.dateOfjoining from coaching cross join joinee where 
coaching.idno = joinee.id order by course desc;

/**asc**/

select * from coaching cross join joinee where 
coaching.idno = joinee.id;

select coaching.fullname, coaching.gender, coaching.email, coaching.contactnumber,
 coaching.address, coaching.college, joinee.course, joinee.amount, joinee.batchtiming,
 coaching.dateofjoining from coaching right join joinee on coaching.idno = joinee.id where college="ceb";
 
select fullname, college from coaching union select course, amount from joinee;

select count(college) as total, gender 
from coaching group by gender order by count(college) desc;



