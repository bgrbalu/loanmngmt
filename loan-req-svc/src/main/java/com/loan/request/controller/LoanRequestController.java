package com.loan.request.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loan.request.entity.LoanRequest;
import com.loan.request.service.LoanReqService;


@RequestMapping("/api/loanrequest")
@RestController
public class LoanRequestController {
@Autowired
LoanReqService loanReqService;

	@RequestMapping (value = "/custRequest", consumes = "application/json", produces = "application/json")
	public String customerLoanRequest(@RequestBody LoanRequest loanRequest) {
		Optional<LoanRequest> loanDetails = loanReqService.saveLoanRequest(loanRequest);
		return loanDetails.get().getAccountNumber().toString();
	}


}
