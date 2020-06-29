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
    cart_id int not null primary key,
    buyer varchar(30) not null,
    mask_kind int not null,
    mask_name varchar(100) not null,
    mask_price int not null,
    mask_count_buy int not null,
    mask_image varchar(15),
    total_price int not null
);

create table maskshopping(
    mask_kind int not null primary key,
    mask_name varchar(20) not null,
    mask_price int not null,
    mask_count int not null,
    made_in int not null,
    company varchar(50) not null,
    make_reg timestamp not null,
    mask_imege varchar(15),
    mask_content text,
    reg_date timestamp not null
);

create table bank(
    account varchar(30) not null,
    bank varchar(10) not null,
    name varchar(10) not null
);

create table board(
    num int not null primary key,
    num_ck tinyint(1) default '0',
    writer varchar(50) not null,
    subject varchar(50) not null,
    passwd varchar(16) not null,
    reg_date timestamp not null,
    redcount int not null default '0',
    ref int not null,
    re_step smallint(6) not null,
    re_level smallint(6) not null,
    content text not null,
    ip varchar(20) not null,
    filename varchar(30)
);