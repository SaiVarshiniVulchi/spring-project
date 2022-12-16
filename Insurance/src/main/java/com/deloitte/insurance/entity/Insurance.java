package com.deloitte.insurance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Insurance {
	
	@Id
	@GeneratedValue
	private Integer ifsc;
	private Integer accno;
	private Integer policyno;
	private String policytype;
	public Insurance() {
		super();
	}
	public Insurance(Integer ifsc, Integer accno, Integer policyno, String policytype) {
		super();
		this.ifsc = ifsc;
		this.accno = accno;
		this.policyno = policyno;
		this.policytype = policytype;
	}
	public Integer getIfsc() {
		return ifsc;
	}
	public void setIfsc(Integer ifsc) {
		this.ifsc = ifsc;
	}
	public Integer getAccno() {
		return accno;
	}
	public void setAccno(Integer accno) {
		this.accno = accno;
	}
	public Integer getPolicyno() {
		return policyno;
	}
	public void setPolicyno(Integer policyno) {
		this.policyno = policyno;
	}
	public String getPolicytype() {
		return policytype;
	}
	public void setPolicytype(String policytype) {
		this.policytype = policytype;
	}
}