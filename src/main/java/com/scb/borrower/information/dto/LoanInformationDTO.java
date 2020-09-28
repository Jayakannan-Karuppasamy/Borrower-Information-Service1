package com.scb.borrower.information.dto;

import java.io.Serializable;

import com.scb.borrower.information.model.BorrowerInformation;

public class LoanInformationDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4650499399230105767L;
	private Long loanId;
	private Long loanAmount;
	private Integer loanTenure;
	private BorrowerInformationDTO borrower;
	private Float loanInterest;
	private String LoanNumber;
	
	
	public LoanInformationDTO() {
	}
	
	public LoanInformationDTO(Long loanAmount, Integer loanTenure, BorrowerInformationDTO borrower, Float loanInterest,
			String loanNumber) {
		this.loanAmount = loanAmount;
		this.loanTenure = loanTenure;
		this.borrower = borrower;
		this.loanInterest = loanInterest;
		LoanNumber = loanNumber;
	}

	public Long getLoanId() {
		return loanId;
	}
	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}
	public Long getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Long loanAmount) {
		this.loanAmount = loanAmount;
	}
	public Integer getLoanTenure() {
		return loanTenure;
	}
	public void setLoanTenure(Integer loanTenure) {
		this.loanTenure = loanTenure;
	}
	public BorrowerInformationDTO getBorrower() {
		return borrower;
	}
	public void setBorrower(BorrowerInformationDTO borrower) {
		this.borrower = borrower;
	}
	public Float getLoanInterest() {
		return loanInterest;
	}
	public void setLoanInterest(Float loanInterest) {
		this.loanInterest = loanInterest;
	}
	public String getLoanNumber() {
		return LoanNumber;
	}
	public void setLoanNumber(String loanNumber) {
		LoanNumber = loanNumber;
	}

	@Override
	public String toString() {
		return "LoanInformationDTO [loanId=" + loanId + ", loanAmount=" + loanAmount + ", loanTenure=" + loanTenure
				+ ", borrower=" + borrower + ", loanInterest=" + loanInterest + ", LoanNumber=" + LoanNumber + "]";
	}
	
	
}
