package com.deloitte.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.bank.entity.Bank;
import com.deloitte.bank.entity.dao.BankRepository;

@Service
public class BankServiceImpl  implements BankService {
	
	
	@Autowired
	   private BankRepository bankRepository;

		
	@Override
	public List<Bank> getAll() {
		// TODO Auto-generated method stub
		return bankRepository.findAll();
	}
}