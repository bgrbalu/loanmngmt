package com.loan.mngmt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.mngmt.entity.CustDetails;

@Repository
public interface CustDetailsRepository extends JpaRepository<CustDetails, Long> {
	
	public List<CustDetails> findByAccountNumber(Integer accountNumber);
	

	/*@Query("update Customer c set c.name = :name WHERE c.id = :customerId")
    void setCustomerName(@Param("customerId") Long id, @Param("name") String name);*/

	//public void update(CustDetails custDetail);
}
