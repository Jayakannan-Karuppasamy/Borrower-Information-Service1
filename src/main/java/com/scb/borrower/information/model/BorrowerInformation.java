package com.scb.borrower.information.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "borrower_details")
@JsonInclude(value = Include.NON_NULL)
public class BorrowerInformation implements Serializable {

	/**
	 * Details of the person or party borrowing the loan amount
	 */

	private static final long serialVersionUID = -1936574580077427015L;

	@Id
	@Column(name = "borrower_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long borrowerId;

	@Column(name = "borrower_full_name")
	private String fullName;

	@Column(name = "borrower_contact")
	private Long contactNumber;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_timestamp")
	private Date createdTime;

	/*
	 * @OneToOne(cascade = CascadeType.ALL,mappedBy = "borrower") private
	 * LoanInformation LoanInformation;
	 */

	public Long getBorrowerId() {
		return borrowerId;
	}

	public void setBorrowerId(Long borrowerId) {
		this.borrowerId = borrowerId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	@Override
	public String toString() {
		return "BorrowerInformation [borrowerId=" + borrowerId + ", fullName=" + fullName + ", contactNumber="
				+ contactNumber + ", createdBy=" + createdBy + ", createdTime=" + createdTime + "]";
	}
	
	/*
	 * public LoanInformation getLoanInformation() { return LoanInformation; }
	 * 
	 * public void setLoanInformation(LoanInformation loanInformation) {
	 * LoanInformation = loanInformation; }
	 */

	/*
	 * @Override public String toString() { return
	 * "BorrowerInformation [borrowerId=" + borrowerId + ", fullName=" + fullName +
	 * ", contactNumber=" + contactNumber + ", createdBy=" + createdBy +
	 * ", createdTime=" + createdTime + ", LoanInformation=" + LoanInformation +
	 * "]"; }
	 */



}
