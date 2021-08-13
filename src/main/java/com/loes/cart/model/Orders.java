package com.loes.cart.model;

import java.util.Date;
import java.util.List;

public class Orders {
	
	private int id;
	
	private double order_total;
	
	private String purchased_at;
	
	private Date order_crated_date;
	
	private List<OrderLines> order_lines;

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getOrder_total() {
		return order_total;
	}

	public void setOrder_total(double order_total) {
		this.order_total = order_total;
	}

	public String getPurchased_at() {
		return purchased_at;
	}

	public void setPurchased_at(String purchased_at) {
		this.purchased_at = purchased_at;
	}

	public Date getOrder_crated_date() {
		return order_crated_date;
	}

	public void setOrder_crated_date(Date order_crated_date) {
		this.order_crated_date = order_crated_date;
	}

	public List<OrderLines> getOrder_lines() {
		return order_lines;
	}

	public void setOrder_lines(List<OrderLines> order_lines) {
		this.order_lines = order_lines;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", order_total=" + order_total + ", purchased_at=" + purchased_at
				+ ", order_crated_date=" + order_crated_date + ", order_lines=" + order_lines + "]";
	}
	
	

}
