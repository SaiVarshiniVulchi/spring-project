package com.deloitte.bank.model;

public class Insurance {
	
	private Integer ifsc;
	private Integer accno;
	private Integer policyno;
	private String premium;
	private Integer coverage;
	private String policytype;
	public Insurance() {
		super();
	}
	public Insurance(Integer ifsc, Integer accno, Integer policyno, String premium, Integer coverage,
			String policytype) {
		super();
		this.ifsc = ifsc;
		this.accno = accno;
		this.policyno = policyno;
		this.premium = premium;
		this.coverage = coverage;
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
	public String getPremium() {
		return premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}
	public Integer getCoverage() {
		return coverage;
	}
	public void setCoverage(Integer coverage) {
		this.coverage = coverage;
	}
	public String getPolicytype() {
		return policytype;
	}
	public void setPolicytype(String policytype) {
		this.policytype = policytype;
	}
}