package com.deloitte.bank.model;

public class Customers {
	
	
	
	private Integer accno;
	private Integer ifsc;
	private String cname;
	private Integer ctno;
	private String address;
	private String acctype;
	public Customers() {
		super();
	}
	public Customers(Integer accno, Integer ifsc, String cname, Integer ctno, String address, String acctype) {
		super();
		this.accno = accno;
		this.ifsc = ifsc;
		this.cname = cname;
		this.ctno = ctno;
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
	public Integer getCtno() {
		return ctno;
	}
	public void setCtno(Integer ctno) {
		this.ctno = ctno;
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