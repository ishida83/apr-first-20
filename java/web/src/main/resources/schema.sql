drop table if exists employee;
drop table if exists service;
create table if not exists service
(
  serviceCode varchar(255) not null,
  serviceName varchar(255) not null,
  primary key(serviceCode)
  
);

create table if not exists employee
(
   name varchar(255) not null,
   emp_Id integer not null AUTO_INCREMENT,
   serviceCode varchar(255) not null,
   password varchar(255) not null, 
   PRIMARY KEY(emp_Id),
   FOREIGN KEY(serviceCode)
   REFERENCES service(serviceCode)
);

