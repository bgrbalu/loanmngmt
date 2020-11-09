package com.loan.request.repository;

import org.springframework.data.repository.CrudRepository;

import com.loan.request.entity.LoanRequest;

public interface LoanReqRepository extends CrudRepository <LoanRequest, Long> {

}
