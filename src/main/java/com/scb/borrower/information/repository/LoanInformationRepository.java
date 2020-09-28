package com.scb.borrower.information.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.scb.borrower.information.model.BorrowerInformation;
import com.scb.borrower.information.model.LoanInformation;

@Repository
public interface LoanInformationRepository extends JpaRepository<LoanInformation, Long> {

// new commit
	@Query(value = "select distinct b.*,l.* "
			+ "from borrower_details b join loan_details l on b.BORROWER_ID = l.BORROWER_ID "
			+ "where b.BORROWER_FULL_NAME=:fullName "
			+ "or l.LOAN_AMOUNT=:loanAmount "
			+ "or l.LOAN_NUMBER=:loanNumber", nativeQuery = true)
	List<LoanInformation> filterByConstraints( @Param("fullName") String fullName, 
			@Param("loanAmount") Long loanAmount,
			@Param("loanNumber") String loanNumber);

 }
