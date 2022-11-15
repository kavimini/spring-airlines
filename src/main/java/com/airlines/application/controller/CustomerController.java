package com.airlines.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airlines.application.entity.Customer;
import com.airlines.application.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/airlines/customers")
	public List<Customer> getCustomers() {
		
		return customerService.findAllCustomers();
	}

}
