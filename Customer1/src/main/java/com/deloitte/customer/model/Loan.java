package com.deloitte.customer.model;

public class Loan {
	
	
	private Integer accno;
	private String loantype;
	private String cibilscore;
	
	public Loan() {
		super();
	}
	public Loan(Integer accno, String loantype, String cibilscore) {
		super();
		this.accno = accno;
		this.loantype = loantype;
		this.cibilscore = cibilscore;
		
	}
	public Integer getAccno() {
		return accno;
	}
	public void setAccno(Integer accno) {
		this.accno = accno;
	}
	public String getLoantype() {
		return loantype;
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	public String getCibilscore() {
		return cibilscore;
	}
	public void setCibilscore(String cibilscore) {
		this.cibilscore = cibilscore;
	}
}