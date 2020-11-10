package com.loan.mngmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.loan.mngmt.CustService.CustService;
import com.loan.mngmt.entity.CustDetails;
import com.loan.mngmt.repository.CustDetailsRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/api")
@ResponseStatus(HttpStatus.OK)
public class LoanManagementController {
	@Autowired
	CustService custService; 
	
	@Autowired
	CustDetailsRepository repository;
	
	@RequestMapping (value = "/custregistration", consumes = "application/json", produces = "application/json")
	public Integer customerRegistration(@RequestBody CustDetails custDetails) {

		// Register the new customer and return the account number
		custService.custRegistration(custDetails);
		return custDetails.getAccountNumber();
	}
	
	@RequestMapping (value = "/custupdate", consumes = "application/json", produces = "application/json")
	public String customerupdate(@RequestBody CustDetails updCustomer) {
		
		List<CustDetails> toUpdateList = repository.findByAccountNumber(updCustomer.getAccountNumber());
		
		for (CustDetails custdetail : toUpdateList) {

			if (updCustomer.getAccountNumber() == custdetail.getAccountNumber()) {
				// Validate user access
				if (updCustomer.getUserName() == custdetail.getUserName()
						&& updCustomer.getUserPassword().equals(custdetail.getUserPassword())) {
					custService.custRegistration(updCustomer);
					break;
				} else {
					log.info("Unauthorized Access! User : {0} ", updCustomer.getUserName());
					return "Unauthorized Access!";
				}
			}
		}

		return "Request Processed for : "+ updCustomer.getUserName();
	}

}
