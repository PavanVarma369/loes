package com.loes.cart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;

import com.loes.cart.model.Customer;
import com.loes.cart.model.CustomerResponse;
import com.loes.cart.model.Orders;

@Service
public class CustomerService {
	
	
	public CustomerService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private RestTemplateBuilder restTemplateBuilder;

	public CustomerResponse getCustomer(String id) {
		CustomerResponse response = new CustomerResponse();
		try {
		
		String custUrl = "https://my-json-server.typicode.com/pfconrey/json-server/customers/";
		String orderUrl = "https://my-json-server.typicode.com/pfconrey/json-server/orders/";
		ResponseEntity<Customer> result = restTemplateBuilder.build().
                exchange(custUrl+id,
                        HttpMethod.GET, null, new ParameterizedTypeReference<Customer>() {});
		
		Customer c = result.getBody();
		
		System.out.print(c);
		
		
		response.setId(c.getId());
		for(int i: c.getOrder_id()) {
			
			ResponseEntity<Orders> order = restTemplateBuilder.build().
	                exchange(orderUrl+i,
	                        HttpMethod.GET, null, new ParameterizedTypeReference<Orders>() {});
			
			response.getOrders().add(order.getBody());
		}
		
		}catch (RestClientException e) {
			e.printStackTrace();
			
		}
		return response;
	}


}
