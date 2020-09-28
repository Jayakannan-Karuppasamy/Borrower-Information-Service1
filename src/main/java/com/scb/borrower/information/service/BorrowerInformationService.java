package com.scb.borrower.information.service;


import java.util.List;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.scb.borrower.information.dto.LoanInformationDTO;
import com.scb.borrower.information.model.LoanInformation;

public interface BorrowerInformationService {

	public List<LoanInformationDTO> searchLoan(String borrower_name, Long loanAmount, String loanNumber)
			throws Exception;
}
