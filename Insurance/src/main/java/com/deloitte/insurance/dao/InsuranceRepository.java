package com.deloitte.insurance.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.insurance.entity.Insurance;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance,Integer>{

List<Insurance> findAll();


List<Insurance> findByPolicytype(String policytype);


List<Insurance> findByPolicyno(Integer policyno);
}
