package com.deloitte.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.insurance.dao.InsuranceRepository;
import com.deloitte.insurance.entity.Insurance;

@RestController
@RequestMapping("/insurance")
public class InsuranceController {
	

		@Autowired
		private InsuranceRepository insuranceRepository;

		@GetMapping("/getInsurance")
		public ResponseEntity<List<Insurance>> getOrders() {
			List<Insurance> ordersList = insuranceRepository.findAll();
			return new ResponseEntity<List<Insurance>>(ordersList, HttpStatus.OK);

		}

		@GetMapping("/getInsurance/{policyno}")
		public ResponseEntity<List<Insurance>> getInsuranceByPolicyno(@PathVariable("policyno") Integer policyno) {
			List<Insurance> insuranceList = insuranceRepository.findByPolicyno(policyno);
			return new ResponseEntity<List<Insurance>>(insuranceList, HttpStatus.OK);
		}
		@GetMapping("/getInsurance/{policytype}")
		public ResponseEntity<List<Insurance>> getInsuranceByPolicytype(@PathVariable("policytype") String policytype) {
			List<Insurance> insuranceList = insuranceRepository.findByPolicytype(policytype);
			return new ResponseEntity<List<Insurance>>(insuranceList, HttpStatus.OK);
		}
}