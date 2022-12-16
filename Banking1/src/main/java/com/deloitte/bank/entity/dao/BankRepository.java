package com.deloitte.bank.entity.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.bank.entity.Bank;
import com.deloitte.bank.model.Customers;

@Repository
public interface BankRepository extends JpaRepository<Bank,Integer>{

	Bank findByBranchname(String branchname);
	
	List<Bank> findByIfsc(Integer ifsc);

	List<Bank> findByIfsc(String string, Class<List> class1);
	
}