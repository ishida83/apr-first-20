--delete from service;

insert into service
values('service1','Application API');

insert into service
values('service2','Demo API');

insert into service
values('service3','Project API');

--delete from employee;

insert into employee
values('aaa', 1001,'service1', 'password1');

insert into employee
values('bbb', 1002,'service1', 'password2');


insert into employee
values('ccc', 1003,'service2', 'password3');

insert into employee
values('ddd', 1004,'service3', 'password4');