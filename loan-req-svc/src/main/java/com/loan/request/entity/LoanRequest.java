package com.loan.request.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "loan_request")
public class LoanRequest {
	@Id
	@GeneratedValue
	
	private Long Id;
	
	private Integer accountNumber;
	
	private String loanType;
	
	private Double loanAmount;
	
	private Date reqDate;
	
	private Double interestRate;
	
	private Integer loanDuaration;

	/**
	 * @return the id
	 */
	public Long getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		Id = id;
	}

	/**
	 * @return the accountNumber
	 */
	public Integer getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the loanType
	 */
	public String getLoanType() {
		return loanType;
	}

	/**
	 * @param loanType the loanType to set
	 */
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	/**
	 * @return the loanAmount
	 */
	public Double getLoanAmount() {
		return loanAmount;
	}

	/**
	 * @param loanAmount the loanAmount to set
	 */
	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	/**
	 * @return the reqDate
	 */
	public Date getReqDate() {
		return reqDate;
	}

	/**
	 * @param reqDate the reqDate to set
	 */
	public void setReqDate(Date reqDate) {
		this.reqDate = reqDate;
	}

	/**
	 * @return the interestRate
	 */
	public Double getInterestRate() {
		return interestRate;
	}

	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	/**
	 * @return the loanDuaration
	 */
	public Integer getLoanDuaration() {
		return loanDuaration;
	}

	/**
	 * @param loanDuaration the loanDuaration to set
	 */
	public void setLoanDuaration(Integer loanDuaration) {
		this.loanDuaration = loanDuaration;
	}
	

}
