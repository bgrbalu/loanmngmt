package com.loan.request.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.request.entity.LoanRequest;
import com.loan.request.repository.LoanReqRepository;

@Service
public class LoanReqService {

	@Autowired
	LoanReqRepository loanRepository;
	public String saveLoanRequest(LoanRequest loanRequest) {
		loanRepository.save(loanRequest);
		return null;
		
	}
}
