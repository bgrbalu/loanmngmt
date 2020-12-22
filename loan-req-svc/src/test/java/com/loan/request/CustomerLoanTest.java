package com.loan.request;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.loan.request.controller.LoanRequestController;
import com.loan.request.entity.LoanRequest;
import com.loan.request.service.LoanReqService;

import net.minidev.json.JSONObject;

@RunWith(SpringRunner.class)	
public class CustomerLoanTest {

	@Mock
	LoanRequestController loanRequestController;
	
	@InjectMocks
	LoanReqService loanReqService;
	
	@Test
	void customerLoanRequestTest() throws JsonMappingException, JsonProcessingException {
		
		JSONObject obj = new JSONObject();
		  obj.put("accountNumber","65478");
		  obj.put("loanType","Personal");
		  obj.put("loanAmount","20000");
		  obj.put("reqDate","2020-11-08");
		  obj.put("interestRate","1.8");
		  obj.put("loanDuaration","60");
		
		assertNotNull(loanRequestController.customerLoanRequest(new ObjectMapper().readValue(obj.toString(), LoanRequest.class)));
	}

}
