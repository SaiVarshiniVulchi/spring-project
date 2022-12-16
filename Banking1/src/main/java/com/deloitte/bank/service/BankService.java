package com.deloitte.bank.service;

import java.util.List;


import com.deloitte.bank.entity.Bank;
public interface BankService {
	
	public List<Bank> getAll();

	public Bank getBank(Integer ifsc);

}
