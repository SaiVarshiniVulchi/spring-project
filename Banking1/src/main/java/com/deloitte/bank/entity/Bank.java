package com.deloitte.bank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Bank {
	
	@Id
	@GeneratedValue
	private Integer ifsc;
	private String branchname;
	private Integer helplineno;
	public Bank() {
		super();
	}
	public Bank(Integer ifsc, String branchname, Integer helplineno) {
		super();
		this.ifsc = ifsc;
		this.branchname = branchname;
		this.helplineno = helplineno;
	}
	public Integer getIfsc() {
		return ifsc;
	}
	public void setIfsc(Integer ifsc) {
		this.ifsc = ifsc;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	public Integer getHelplineno() {
		return helplineno;
	}
	public void setHelplineno(Integer helplineno) {
		this.helplineno = helplineno;
	}
}
