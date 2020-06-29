package com.myspring.shopping.testdb;

public class CartVO {
	private int cart_id;
	private String buyer;
	private int mask_kind;
	private int mask_price;
	private int mask_count_buy;
	private String mask_image;
	private int total_price;
	
	public int getCart_id() {
		return cart_id;
	}
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	public int getMask_kind() {
		return mask_kind;
	}
	public void setMask_kind(int mask_kind) {
		this.mask_kind = mask_kind;
	}
	public int getMask_price() {
		return mask_price;
	}
	public void setMask_price(int mask_price) {
		this.mask_price = mask_price;
	}
	public int getMask_count_buy() {
		return mask_count_buy;
	}
	public void setMask_count_buy(int mask_count_buy) {
		this.mask_count_buy = mask_count_buy;
	}
	public String getMask_image() {
		return mask_image;
	}
	public void setMask_image(String mask_image) {
		this.mask_image = mask_image;
	}
	public int getTotal_price() {
		return total_price;
	}
	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}
	
	
}
