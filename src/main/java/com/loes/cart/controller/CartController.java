package com.loes.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.loes.cart.model.CustomerResponse;
import com.loes.cart.service.CustomerService;

@RestController
public class CartController {
	
	@Autowired
	CustomerService custService;
	
	@GetMapping("/getCustomers/{id}")
	public CustomerResponse getCustomerResponse(@PathVariable String id) {
		return custService.getCustomer(id);
	}

}
