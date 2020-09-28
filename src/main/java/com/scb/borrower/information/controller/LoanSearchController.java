package com.scb.borrower.information.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty	
import com.scb.borrower.information.dto.LoanInformationDTO;
/*import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;*/
import com.scb.borrower.information.model.BorrowerInformation;
import com.scb.borrower.information.model.LoanInformation;
import com.scb.borrower.information.payloadrequest.LoanSearchRequestPayload;
import com.scb.borrower.information.service.BorrowerInformationService;
import com.scb.borrower.information.util.RecordNotFoundException;

@RestController
@RequestMapping(value = "/loan")
@RibbonClient(name = "borrower-information-service")
public class LoanSearchController {
	
	private static Logger log = LoggerFactory.getLogger(LoanSearchController.class);

	@Autowired
	private Environment env;
	
	@Autowired
	BorrowerInformationService borrowerInformationService;

	@PostMapping(value = "/search",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<LoanInformationDTO>> searchLoanByBorrowerInformation(
			@RequestBody LoanSearchRequestPayload payload) throws Exception {
		log.info("Request Payload :"+payload.toString());
		List<LoanInformationDTO> listOfLoanInfor=null;
		try {
			listOfLoanInfor = borrowerInformationService
				.searchLoan(payload.getFullName(), payload.getLoanAmount(), payload.getLoanNumber());
			}catch(Exception e) {
                   e.printStackTrace();
			}
		if(!listOfLoanInfor.isEmpty()) {
			return new ResponseEntity<List<LoanInformationDTO>>(listOfLoanInfor, HttpStatus.OK);
		}else {
			throw new RecordNotFoundException("Record Not found...!");
		}
	}
	
	@GetMapping(value = "/welcome")
	public String eurekaTest() {
		return "Welcome Borrower information service registered in eureka server.. running on port:::"+env.getProperty("local.server.port");
	}
	
	
}
