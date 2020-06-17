package com.cognizant.loan;

public class Loan {

	private String number;
	private String type;
	private long loan;
	private long emi;
	private long tenure;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getLoan() {
		return loan;
	}

	public void setLoan(long loan) {
		this.loan = loan;
	}

	public long getEmi() {
		return emi;
	}

	public void setEmi(long emi) {
		this.emi = emi;
	}

	public long getTenure() {
		return tenure;
	}

	public void setTenure(long tenure) {
		this.tenure = tenure;
	}

	public Loan(String number, String type, long loan, long emi, long tenure) {
		super();
		this.number = number;
		this.type = type;
		this.loan = loan;
		this.emi = emi;
		this.tenure = tenure;
	}

	public Loan() {
		super();
	}

	@Override
	public String toString() {
		return "Loan [number=" + number + ", type=" + type + ", loan=" + loan + ", emi=" + emi + ", tenure=" + tenure
				+ "]";
	}

}
