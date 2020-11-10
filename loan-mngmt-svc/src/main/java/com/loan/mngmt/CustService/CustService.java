package com.loan.mngmt.CustService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.mngmt.entity.CustDetails;
import com.loan.mngmt.repository.CustDetailsRepository;

@Service
public class CustService {
	@Autowired 
	CustDetailsRepository custDetailsRepository;
	
	public void custRegistration(CustDetails custDetail) {
		custDetailsRepository.save(custDetail);
		
	}
	

}
