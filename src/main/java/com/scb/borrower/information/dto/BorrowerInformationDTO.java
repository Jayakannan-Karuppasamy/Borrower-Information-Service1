package com.scb.borrower.information.dto;

import java.io.Serializable;
import java.util.Date;

public class BorrowerInformationDTO implements Serializable {
	private Long borrowerId;
	private String fullName;
	private Long contactNumber;
	private String createdBy;
	private Date createdTime;
	
	
	public BorrowerInformationDTO() {
	}
	
	
	public BorrowerInformationDTO(String fullName, Long contactNumber, String createdBy,
			Date createdTime) {
		this.fullName = fullName;
		this.contactNumber = contactNumber;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
	}


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
		return "BorrowerInformationDTO [borrowerId=" + borrowerId + ", fullName=" + fullName + ", contactNumber="
				+ contactNumber + ", createdBy=" + createdBy + ", createdTime=" + createdTime + "]";
	}
	
	
}
