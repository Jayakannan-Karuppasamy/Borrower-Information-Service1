package com.scb.borrower.information.payloadrequest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.scb.borrower.information.dto.LoanInformationDTO;
import com.scb.borrower.information.model.LoanInformation;

@JsonInclude(value = Include.NON_NULL)
public class LoanSearchRequestPayload {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9073314006999578749L;

	private Long loanAmount;
	private String LoanNumber;
	private String fullName;

	public LoanSearchRequestPayload() {
	}
	
	public LoanSearchRequestPayload(Long loanAmount, String loanNumber, String fullName) {
		this.loanAmount = loanAmount;
		LoanNumber = loanNumber;
		this.fullName = fullName;
	}
	public Long getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Long loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getLoanNumber() {
		return LoanNumber;
	}
	public void setLoanNumber(String loanNumber) {
		LoanNumber = loanNumber;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "LoanSearchRequestPayload [loanAmount=" + loanAmount + ", LoanNumber=" + LoanNumber + ", fullName="
				+ fullName + "]";
	}
	
	
}
