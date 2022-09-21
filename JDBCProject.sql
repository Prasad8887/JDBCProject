
create database hospital;
use hospital;
create table Patient(Pid int primary key not null,Name varchar(45),birthdate varchar(54),gender varchar(67),
mobileNo long ,address varchar(67),bloodGroup varchar(67),diseases varchar(67),medicineAllergy varchar(67),doctorId varchar(67));
select * from Patient;


create table Doctor(doctorId varchar(56),dname varchar(45),dbirthdate varchar(54),dgender varchar(67),
dmobileNo long ,daddress varchar(67),dbloodGroup varchar(67),speciality varchar(67),medicineAllergy varchar(67));
select * from Doctor;
