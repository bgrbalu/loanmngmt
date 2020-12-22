package com.loan.request.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.request.entity.LoanRequest;
import com.loan.request.repository.LoanReqRepository;

@Service
public class LoanReqService {

	@Autowired
	LoanReqRepository loanRepository;

	public Optional<LoanRequest> saveLoanRequest(LoanRequest loanRequest) {
		// Save the load request
		try {
			loanRepository.save(loanRequest);
			return loanRepository.findById(loanRequest.getId());

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
