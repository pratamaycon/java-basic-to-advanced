use coursejdbc;

create table department (
	id bigint unsigned not null auto_increment,
    name varchar(60) default null,
    primary key (id)
);

create table seller (
	id bigint not null auto_increment,
    name varchar(60) not null,
    email varchar(120) not null,
    birthDate datetime not null,
    baseSalary double not null,
    department_id bigint unsigned not null,
    primary key (id),
    foreign key (department_id) references department (id)
);

insert into department (name) 
	values
('Computers'),
('Electronics'),
('Fashion'),
('Books');

insert into seller (name, email, birthDate, baseSalary, department_id) 
	values
('Bob  Brown', 'bob@gmail.com', '1998-04-21 00:00:00', 1000, 1),
('Maria Green', 'maria@gmail.com', '1972-12-21 00:00:00', 3500, 2),
('Alex  Grey', 'alex@gmail.com', '1988-01-15 00:00:00', 2200, 1),
('Martha Red', 'martha@gmail.com', '1993-11-30 00:00:00', 3000, 4),
('Donald Blue', 'donald@gmail.com', '2000-01-09 00:00:00', 4000, 3),
('Alex  pink', 'bob@gmail.com', '1997-03-04 00:00:00', 2200, 2);