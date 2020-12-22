package com.loan.request;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import com.loan.request.controller.LoanRequestController;

import net.minidev.json.JSONObject;

@RunWith(SpringRunner.class)	
public class CustomerRegistrationTest {

	@Mock
	LoanRequestController loanReq;
	
	@Test
	void custRegTest() {
		
		JSONObject obj = new JSONObject();
		obj.put("custName" , "Praneash");
		obj.put("userName" , "pran");
		obj.put("userPassword" , "pran");
		obj.put("custAddress", "Chicago");
		obj.put("custState", "ON");
		obj.put("custCountry" , "Canada");
		obj.put("custEmailAddres" ,"test@gmail.com");
		obj.put("custPan" , "AMASDLHOSA98");
		obj.put("custContactNo" , "3652282722");
		obj.put("custDOB" , "2018-02-01");
		obj.put("accountType" , "Savings");
		obj.put("accountNumber","12356" );
		
		//new ObjectMapper().readValue(obj, LoanRequest.class);
		//new ObjectMapper().readValue(obj, LoanRequest.class)
		loanReq.customerLoanRequest(obj);
	}

}
