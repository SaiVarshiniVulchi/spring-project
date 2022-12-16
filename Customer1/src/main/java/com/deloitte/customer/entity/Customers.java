package com.deloitte.customer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Customers {
	
	@Id
	@GeneratedValue	
	private Integer accno;
	private Integer ifsc;
	private String cname;
	private String address;
	private String acctype;
	public Customers() {
		super();
	}
	public Customers(Integer accno, Integer ifsc, String cname, String address, String acctype) {
		super();
		this.accno = accno;
		this.ifsc = ifsc;
		this.cname = cname;
		this.address = address;
		this.acctype = acctype;
	}
	public Integer getAccno() {
		return accno;
	}
	public void setAccno(Integer accno) {
		this.accno = accno;
	}
	public Integer getIfsc() {
		return ifsc;
	}
	public void setIfsc(Integer ifsc) {
		this.ifsc = ifsc;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
}