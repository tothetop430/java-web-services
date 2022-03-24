create table person
(
	id integer not null,
	name varchar(254) not null,
	location varchar(254) not null,
	birth_date timestamp,
	primary key(id)
);

insert into person (id, name, location, birth_date)
values(10001, 'Sid', 'Gzb', sysdate());

insert into person (id, name, location, birth_date)
values(10002, 'Abhi', 'Gzb', sysdate());

insert into person (id, name, location, birth_date)
values(10003, 'Shiv', 'Gzb', sysdate());