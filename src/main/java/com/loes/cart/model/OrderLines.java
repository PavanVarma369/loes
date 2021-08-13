package com.loes.cart.model;

public class OrderLines {
	
	private String item_id;
	
	private String item_description;
	
	private String item_qty;
	
	private double item_price; 

	public OrderLines() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getItem_id() {
		return item_id;
	}

	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}

	public String getItem_description() {
		return item_description;
	}

	public void setItem_description(String item_description) {
		this.item_description = item_description;
	}

	public String getItem_qty() {
		return item_qty;
	}

	public void setItem_qty(String item_qty) {
		this.item_qty = item_qty;
	}

	public double getItem_price() {
		return item_price;
	}

	public void setItem_price(double item_price) {
		this.item_price = item_price;
	}

	@Override
	public String toString() {
		return "OrderLines [item_id=" + item_id + ", item_description=" + item_description + ", item_qty=" + item_qty
				+ ", item_price=" + item_price + "]";
	}

}
