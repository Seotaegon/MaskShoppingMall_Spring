create table member (
	num int not null primary key,
	id varchar(16) not null,
	pw varchar(16) not null,
	name varchar(30) not null,
	email varchar(30) not null,
	reg_date timestamp,
	reg_date_last timestamp,
	ip varchar(20),
	ip_last varchar(20)
);

create table cart(
    
);
