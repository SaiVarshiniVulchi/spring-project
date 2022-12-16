package com.deloitte.bank.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.deloitte.bank.entity.Bank;
import com.deloitte.bank.entity.dao.BankRepository;
import com.deloitte.bank.model.Customers;
import com.deloitte.bank.service.BankService;


@RestController
@RequestMapping("/bank")
public class BankController {

	@Autowired
	private BankService bankService;
	
	@Autowired
	private BankRepository brepo;

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Bank>> getBank() {
		List<Bank> bank = bankService.getAll();
		return new ResponseEntity<List<Bank>>(bank, HttpStatus.OK);

	}

@GetMapping("/get/{ifsc}")
public ResponseEntity<List<Bank>> getByIfsc(@PathVariable("ifsc") Integer ifsc) {
	List<Bank> ifs = brepo.findByIfsc("http://localhost:8082/orders/getOrder/"+ifsc,List.class);
	return new ResponseEntity<List<Bank>>(ifs, HttpStatus.OK);
}
@GetMapping("/get/{branchname}")
public ResponseEntity<Bank> getByBranchname(@PathVariable("branchname") String branchname) {
	Bank bn = brepo.findByBranchname(branchname);
	return new ResponseEntity<Bank>(bn, HttpStatus.OK);
}
}