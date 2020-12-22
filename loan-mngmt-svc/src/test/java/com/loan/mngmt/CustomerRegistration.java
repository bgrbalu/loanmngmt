package com.loan.mngmt;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.loan.mngmt.CustService.CustService;
import com.loan.mngmt.controller.LoanManagementController;
import com.loan.mngmt.entity.CustDetails;
import com.loan.mngmt.repository.CustDetailsRepository;

import net.minidev.json.JSONObject;
@RunWith(SpringRunner.class)	
public class CustomerRegistration {

	@Mock
	LoanManagementController loanMgmt;
	
	@InjectMocks
	CustService custService;
	@Mock
	CustDetailsRepository repository;
	
	@Test
public void custRegTest() throws JsonMappingException, JsonProcessingException {
		
		JSONObject obj = new JSONObject();
		obj.put("custName", "TestUser");
		obj.put("userName", "Test");
		obj.put("userPassword", "testpwd");
		obj.put("custAddress", "Chicago");
		obj.put("custState", "ON");
		obj.put("custCountry", "Canada");
		obj.put("custEmailAddres" ,"test@gmail.com");
		obj.put("custPan" , "AMASDLHOSA98");
		obj.put("custContactNo", "3652282722");
		obj.put("custDOB" , "2018-02-01");
		obj.put("accountType" , "Savings");
		obj.put("accountNumber","4578" );
		
		assertNotNull(loanMgmt.customerRegistration(new ObjectMapper().readValue(obj.toString(), CustDetails.class)));
		
	}

public void custUpdateTest() throws JsonMappingException, JsonProcessingException {
		
		JSONObject obj = new JSONObject();
		obj.put("custName" , "TestUser");
		obj.put("userName" , "Test");
		obj.put("userPassword" , "testpwd");
		obj.put("custAddress", "Chicago");
		obj.put("custState", "ON");
		obj.put("custCountry" , "Canada");
		obj.put("custEmailAddres" ,"test@gmail.com");
		obj.put("custPan" , "AMASDLHOSA98");
		obj.put("custContactNo" , "3652282722");
		obj.put("custDOB" , "2018-02-01");
		obj.put("accountType" , "Savings");
		obj.put("accountNumber","545687" );
		
		assertNotNull(loanMgmt.customerupdate(new ObjectMapper().readValue(obj.toString(), CustDetails.class)));
	}
}
