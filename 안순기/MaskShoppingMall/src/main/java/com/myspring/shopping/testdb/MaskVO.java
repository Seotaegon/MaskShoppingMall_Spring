package com.myspring.shopping.testdb;

import java.sql.Timestamp;


public class MaskVO {
	private int mask_kind;
	private String mask_name;
	private int mask_price;
	private int mask_count;
	private int made_in;
	private String company;
	private Timestamp make_reg;
	private String mask_image;
	private String mask_content;
	private Timestamp reg_date;
	
	
	public int getMask_kind() {
		return mask_kind;
	}
	public void setMask_kind(int mask_kind) {
		this.mask_kind = mask_kind;
	}
	public String getMask_name() {
		return mask_name;
	}
	public void setMask_name(String mask_name) {
		this.mask_name = mask_name;
	}
	public int getMask_price() {
		return mask_price;
	}
	public void setMask_price(int mask_price) {
		this.mask_price = mask_price;
	}
	public int getMask_count() {
		return mask_count;
	}
	public void setMask_count(int mask_count) {
		this.mask_count = mask_count;
	}
	public int getMade_in() {
		return made_in;
	}
	public void setMade_in(int made_in) {
		this.made_in = made_in;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Timestamp getMake_reg() {
		return make_reg;
	}
	public void setMake_reg(Timestamp make_reg) {
		this.make_reg = make_reg;
	}
	public String getMask_image() {
		return mask_image;
	}
	public void setMask_image(String mask_image) {
		this.mask_image = mask_image;
	}
	public String getMask_content() {
		return mask_content;
	}
	public void setMask_content(String mask_content) {
		this.mask_content = mask_content;
	}
	public Timestamp getReg_date() {
		return reg_date;
	}
	public void setReg_date(Timestamp reg_date) {
		this.reg_date = reg_date;
	}
	
	
}
