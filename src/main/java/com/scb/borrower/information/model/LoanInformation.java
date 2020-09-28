package com.scb.borrower.information.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.common.base.CaseFormat;

@Entity
@Table(name="loan_details")
@JsonInclude(value = Include.NON_NULL)
public class LoanInformation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -735766153752899235L;

	@Id
	@Column(name="loan_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long loanId;
	
	@Column(name="loan_amount")
	private Long loanAmount;
	
	@Column(name="loan_tenure")
	private Integer loanTenure;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "borrower_id")
	private BorrowerInformation borrower;
	
	@Column(name="loan_interest")
	private Float loanInterest;
	
	@Column(name="loan_number")
	private String LoanNumber;

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

	public BorrowerInformation getBorrower() {
		return borrower;
	}

	public void setBorrower(BorrowerInformation borrower) {
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
		return "LoanInformation [loanId=" + loanId + ", loanAmount=" + loanAmount + ", loanTenure=" + loanTenure
				+ ", borrower=" + borrower + ", loanInterest=" + loanInterest + ", LoanNumber=" + LoanNumber + "]";
	}
	
	
}
