package com.deloitte.customer.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.deloitte.customer.dao.CustomerRepository;
import com.deloitte.customer.entity.Customers;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/getCustomers")
	public ResponseEntity<List<Customers>>getCustomers() {
		List<Customers> customersList = customerRepository.findAll();
		return new ResponseEntity<List<Customers>>(customersList, HttpStatus.OK);

	}
	@GetMapping("/getCustomers/{accno}")
	public ResponseEntity<List<Customers>>getCustomersByAccno(@PathVariable("accno") Integer accno) {
		List<Customers> customersList =  customerRepository.findByAccno(accno);
		return new ResponseEntity<List<Customers>>(customersList, HttpStatus.OK);

	}
	@GetMapping("/getCustomers/{acctype}")
	public ResponseEntity<List<Customers>>getCustomersByAcctype(@PathVariable("acctype") Integer acctype) {
		List<Customers> customersList =  customerRepository.findByAcctype(acctype);
		return new ResponseEntity<List<Customers>>(customersList, HttpStatus.OK);
	}
	
}