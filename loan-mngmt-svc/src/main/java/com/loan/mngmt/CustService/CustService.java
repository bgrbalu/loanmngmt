package com.loan.mngmt.CustService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.loan.mngmt.entity.CustDetails;
import com.loan.mngmt.repository.CustDetailsRepository;

@Service
public class CustService {
	@Autowired 
	CustDetailsRepository custDetailsRepository;
	
	@Transactional
	public void custRegistration(CustDetails custDetail) {
		try {
		custDetailsRepository.saveAndFlush(custDetail);
		}catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
	
	public List<CustDetails> getCustDetails(Integer accountNumber) {
		
		return custDetailsRepository.findByAccountNumber(accountNumber);
		
	}
	

}
