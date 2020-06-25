package com.myspring.shopping.testdb;

import java.sql.Timestamp;

//+---------------+-------------+------+-----+---------------------+-------------------------------+
//| Field         | Type        | Null | Key | Default             | Extra                         |
//+---------------+-------------+------+-----+---------------------+-------------------------------+
//| num           | int(11)     | NO   | PRI | NULL                |                               |
//| id            | varchar(20) | NO   |     | NULL                |                               |
//| pw            | varchar(16) | NO   |     | NULL                |                               |
//| name          | varchar(50) | NO   |     | NULL                |                               |
//| reg_date      | timestamp   | NO   |     | current_timestamp() | on update current_timestamp() |
//| reg_date_last | timestamp   | NO   |     | 0000-00-00 00:00:00 |                               |
//+---------------+-------------+------+-----+---------------------+-------------------------------+


public class TestVO {
	private int num;
	private String id;
	private String pw;
	private String name;
	Timestamp reg_date;
	Timestamp reg_date_last;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getReg_date() {
		return reg_date;
	}
	public void setReg_date(Timestamp reg_date) {
		this.reg_date = reg_date;
	}
	public Timestamp getReg_date_last() {
		return reg_date_last;
	}
	public void setReg_date_last(Timestamp reg_date_last) {
		this.reg_date_last = reg_date_last;
	}
}
