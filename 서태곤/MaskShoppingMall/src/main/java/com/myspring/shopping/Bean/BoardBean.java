package com.myspring.shopping.Bean;

import java.sql.Timestamp;

public class BoardBean {
/*	+----------+-------------+------+-----+---------------------+-------------------------------+
	| Field    | Type        | Null | Key | Default             | Extra                         |
	+----------+-------------+------+-----+---------------------+-------------------------------+
	| num      | int(11)     | NO   | PRI | NULL                |                               |
	| num_ck   | tinyint(1)  | YES  |     | 0                   |                               |
	| writer   | varchar(50) | NO   |     | NULL                |                               |
	| subject  | varchar(50) | NO   |     | NULL                |                               |
	| passwd   | varchar(16) | NO   |     | NULL                |                               |
	| reg_date | timestamp   | NO   |     | current_timestamp() | on update current_timestamp() |
	| redcount | int(11)     | NO   |     | 0                   |                               |
	| ref      | int(11)     | NO   |     | NULL                |                               |
	| re_step  | smallint(6) | NO   |     | NULL                |                               |
	| re_level | smallint(6) | NO   |     | NULL                |                               |
	| content  | text        | NO   |     | NULL                |                               |
	| ip       | varchar(20) | NO   |     | NULL                |                               |
	| filename | varchar(30) | YES  |     | NULL                |                               |
	+----------+-------------+------+-----+---------------------+-------------------------------+*/
	
	int num;
	int num_ck;
	String writer;
	String subject;
	String passwd;
	Timestamp reg_date;
	int rdecount;
	int ref;
	int re_step;
	int re_level;
	String content;
	String ip;
	String filename;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum_ck() {
		return num_ck;
	}
	public void setNum_ck(int num_ck) {
		this.num_ck = num_ck;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public Timestamp getReg_date() {
		return reg_date;
	}
	public void setReg_date(Timestamp reg_date) {
		this.reg_date = reg_date;
	}
	public int getRdecount() {
		return rdecount;
	}
	public void setRdecount(int rdecount) {
		this.rdecount = rdecount;
	}
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public int getRe_step() {
		return re_step;
	}
	public void setRe_step(int re_step) {
		this.re_step = re_step;
	}
	public int getRe_level() {
		return re_level;
	}
	public void setRe_level(int re_level) {
		this.re_level = re_level;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
}
