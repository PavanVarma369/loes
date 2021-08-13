package com.loes.cart.model;

import java.util.List;

public class Customer {
	
	private String id;
	
	private List<Integer> order_id;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Integer> getOrder_id() {
		return order_id;
	}

	public void setOrder_id(List<Integer> order_id) {
		this.order_id = order_id;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", order_id=" + order_id + "]";
	}
	
	

}
