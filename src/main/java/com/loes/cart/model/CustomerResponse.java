package com.loes.cart.model;

import java.util.ArrayList;
import java.util.List;

public class CustomerResponse {
	
	private String id;
	
	private List<Orders> orders = new ArrayList<>();

	public CustomerResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	
	public void addOrders(Orders order) {
		if(this.orders !=null)
			this.orders.add(order);
	}

	@Override
	public String toString() {
		return "CustomerResponse [id=" + id + ", orders=" + orders + "]";
	}
	
}
