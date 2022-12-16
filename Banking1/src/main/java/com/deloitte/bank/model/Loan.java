package com.deloitte.bank.model;

public class Loan {
	
	
	private Integer accno;
	private String loantype;
	private String cibilscore;
	private String toi;
	private Integer poi;
	private Integer tim;
	private Integer princamt;
	public Loan() {
		super();
	}
	public Loan(Integer accno, String loantype, String cibilscore, String toi, Integer poi, Integer tim,
			Integer princamt) {
		super();
		this.accno = accno;
		this.loantype = loantype;
		this.cibilscore = cibilscore;
		this.toi = toi;
		this.poi = poi;
		this.tim = tim;
		this.princamt = princamt;
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
	public String getToi() {
		return toi;
	}
	public void setToi(String toi) {
		this.toi = toi;
	}
	public Integer getPoi() {
		return poi;
	}
	public void setPoi(Integer poi) {
		this.poi = poi;
	}
	public Integer getTim() {
		return tim;
	}
	public void setTim(Integer tim) {
		this.tim = tim;
	}
	public Integer getPrincamt() {
		return princamt;
	}
	public void setPrincamt(Integer princamt) {
		this.princamt = princamt;
	}
}