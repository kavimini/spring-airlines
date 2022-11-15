package com.airlines.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airlines.application.entity.Customer;
import com.airlines.application.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired 
	private CustomerRepository customerRepo;
	
	public List<Customer> findAllCustomers() {
		
		
		return customerRepo.findAll();
	}

}
