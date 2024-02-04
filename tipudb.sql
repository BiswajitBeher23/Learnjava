create database tipudb;

use tipudb;

CREATE TABLE IF NOT EXISTS  `coaching` (
  `idno` int NOT NULL AUTO_INCREMENT,
  `fullname` varchar(200) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `contactnumber` bigint NOT NULL,
  `address` varchar(200) NOT NULL,
  `college` varchar(100) DEFAULT NULL,
  `dateOfjoining` date NOT NULL,
  `age` int NOT NULL,
  PRIMARY KEY (`idno`),
  UNIQUE KEY `contactnumber` (`contactnumber`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `joinee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `course` varchar(200) NOT NULL,
  `amount` varchar(100) NOT NULL,
  `batchtiming` varchar(100) NOT NULL,
  `startdate` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

show tables;

desc coaching;

alter table coaching modify dateOfjoining date not null;

alter table coaching modify contactnumber bigint not null;

insert into coaching (fullname, gender, email, contactnumber, address, college, dateOfjoining, age) 
values ('Santosh Pradhan', 'male','santosh@gmail.com', '9824358602', 'patia, bhubaneswar', 'cept', '2023-07-05', 30),
('Ashish  ku nayak', 'male','ashish23@gmail.com', '9102739865', 'patrapada, bhubaneswar', 'kits', '2022-09-13', 22),
('Rajib lochan rout', 'male','rajib24@gmail.com', '7545045072', 'fire station, bhubaneswar', 'bec', '2022-11-07', 29), 
('Ramani ramnjan rout', 'male','ramani35@gmail.com', '8233027044', 'jaydev bihar, bhubaneswar', 'kec', '2022-11-09', 27),
('Prakuti mishra', 'female','prakuti34@gmail.com', '7572485248', 'bani bihar, bhubaneswar', 'ASBM', '2022-11-05', 31),
('Monalisha mohapatra', 'female','monalisha23@gmail.com', '9909215421', 'rasulgada, bhubaneswar', 'NIT', '2022-11-02', 20);



/**
('Biswajit Behera', 'male','biswa2024@gmail.com', '7877456678', 'meduakual, jajpur', 'ceb', '2023-11-23'),
('Sadeep malik', 'male','sadeep@gmail.com', '6589456234', 'chandaka, bhubaneswar', 'nit', '2023-12-02'),
('Sandip sahoo', 'male','sandip@gmail.com', '7685459800', 'cuttack', 'abit', '2023-10-19'),
('Malabika patra', 'female','malbika@gmail.com', '7896457743', 'patia, bhubaneswar', 'ceb', '2024-01-05'),
('Sasmita patra', 'female','sasmita@gmail.com', '7896345542', 'nayapalli, bhubaneswar', 'techno', '2023-10-25'),
('Rashmi Sahoo', 'male','rashmi34@gmail.com', '9087776554', 'bhomikhal, bhubaneswar', 'abit', '2023-12-02'),
*/

select * from coaching;

desc joinee;

alter table joinee modify startdate date not null;

insert into joinee(course, amount, batchtiming, startdate) 
values ('frontend', '5000', 'morning', '2023-07-05'),
('database', '3000', 'afternoon', '2022-09-13'),
('data analyst', '7000', 'evening', '2022-11-07'),
('backend', '5000', 'morning', '2022-11-09'),
('fullstack', '3000', 'afternoon', '2022-11-05'),
('python', '7000', 'evening', '2022-11-02');

select * from joinee;

alter table coaching AUTO_INCREMENT = 1; 

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

use tipudb;

select * from coaching limit 4;

DROP TABLE table_name;

ALTER TABLE table_name
ADD column_name bigint;
ALTER TABLE table_name
modify column_name int;
ALTER TABLE table_name
DROP COLUMN column_name;

desc coaching;

select * from coaching;
select * from joinee;


alter table coaching modify contactnumber bigint not null unique;

ALTER TABLE coaching
modify age int not null;

select * from coaching inner join joinee on coaching.idno = joinee.id;

/**AND, OR, NOT**/
select fullname, gender, age from coaching where age < 25 and gender = 'male';
select fullname, gender, age, college from coaching where not age = 30;

/**MIN, MAX**/
select min(age) as LeastAge from coaching; 
select max(age) as LeastAge from coaching; 

/**COUNT, AVG, SUM**/
select gender, count(college) from coaching group by gender;
select avg(age) from coaching;
select sum(amount), course from joinee group by course;

/**LIKE**/
select fullname, gender, college from coaching where fullname like 'b%' or college like 'a%';

select * from coaching inner join joinee on coaching.idno = joinee.id where fullname like 's%' and course like 'java';

select * from coaching inner join joinee on coaching.idno = joinee.id where fullname like '%k';
select * from coaching inner join joinee on coaching.idno = joinee.id where fullname like '%sh%';
select * from coaching inner join joinee on coaching.idno = joinee.id where fullname like '_v%';
select * from coaching inner join joinee on coaching.idno = joinee.id where fullname like 'a__i%';
select * from coaching inner join joinee on coaching.idno = joinee.id where fullname like 'm%a';
select * from coaching inner join joinee on coaching.idno = joinee.id where fullname like 'a%k';
select * from coaching inner join joinee on coaching.idno = joinee.id where fullname like 'r%t';
select * from coaching inner join joinee on coaching.idno = joinee.id where fullname like 'r__i%';
select * from coaching inner join joinee on coaching.idno = joinee.id where fullname like '__i%';
select * from coaching inner join joinee on coaching.idno = joinee.id where address='patia, bhubaneswar';
select * from coaching inner join joinee on coaching.idno = joinee.id where college='ceb';
select * from coaching inner join joinee on coaching.idno = joinee.id where gender='male';
select * from coaching inner join joinee on coaching.idno = joinee.id where course='java';
select * from coaching inner join joinee on coaching.idno = joinee.id where age>='23';
select * from coaching inner join joinee on coaching.idno = joinee.id where dateOfjoining>='2023-07-23';
select * from coaching inner join joinee on coaching.idno = joinee.id where amount<='9000';

select * from coaching inner join joinee on coaching.idno = joinee.id where course in ('java', 'python');

select * from coaching inner join joinee on coaching.idno = joinee.id where course not in ('java');

select * from coaching inner join joinee on coaching.idno = joinee.id where age between 22 and 27;

select * from coaching inner join joinee on coaching.idno = joinee.id 
where dateOfjoining < now() - interval 3 month;

















