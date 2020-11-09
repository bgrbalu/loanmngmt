package com.loan.mngmt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.loan.mngmt.entity.CustDetails;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/api")
@ResponseStatus(HttpStatus.OK)
public class LoanManagementController {
	
	@RequestMapping (value = "/custregistration", consumes = "application/json", produces = "application/json")
	public String customerRegistration(@RequestBody CustDetails custDetails) {
		custDetails.getCustName();
		return custDetails.getCustDOB().toString();
	}

}
