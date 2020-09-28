package com.scb.borrower.information.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scb.borrower.information.controller.LoanSearchController;
import com.scb.borrower.information.dto.LoanInformationDTO;
import com.scb.borrower.information.model.BorrowerInformation;
import com.scb.borrower.information.model.LoanInformation;
import com.scb.borrower.information.repository.BorrowerInformationRepository;
import com.scb.borrower.information.repository.LoanInformationRepository;

@Component
public class BorrowerInformationDAO {
	
	private static Logger log = LoggerFactory.getLogger(BorrowerInformationDAO.class);

	@Autowired
	LoanInformationRepository loanInfoRepository;
	
	@Autowired
	BorrowerInformationRepository borrowerInfoRepository;
	
	@Autowired
    ModelMapper modelMapper;

	public List<LoanInformationDTO> searchBorrowerLoan(String borrowerFullName,Long loanAmount,String loanNumber){
		log.info("called BorrowerInformationDAO");
		List<LoanInformationDTO> loanDAO=loanInfoRepository.filterByConstraints(borrowerFullName, loanAmount, loanNumber);
		log.info("called BorrowerInformationDAO"+loanDAO.toString());
		return loanDAO.stream().map(this::convertToDto).collect(Collectors.toList());
	}
	
	private LoanInformationDTO convertToDto(LoanInformation loanInformation) {
        LoanInformationDTO loanInformationDto = modelMapper.map(loanInformation, LoanInformationDTO.class);
		return loanInformationDto;
	}
}
