package com.deloitte.customer.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.customer.entity.Customers;


@Repository
public interface CustomerRepository extends JpaRepository<Customers,Integer> {

	

	List<Customers> findByAccno(Integer accno);
	List<Customers> findByAcctype(Integer acctype);
	
}