package com.loan.mngmt.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CustDetails {
	
	@Id
	@GeneratedValue
	private Long custId;
	
	private String custName;
	
	private String userName;
	
	private String userPassword;
	
	private String custAddress;

	private String custState;

	private String custCountry;

	private String custEmailAddres;
	
	private String custPan;

	private String custConstactNo;
	
	private Date custDOB;
	
	private String accountType;
	
	private Integer accountNumber;

	/**
	 * @return the custName
	 */
	public String getCustName() {
		return custName;
	}

	/**
	 * @param custName the custName to set
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public String getCustState() {
		return custState;
	}

	public void setCustState(String custState) {
		this.custState = custState;
	}

	public String getCustCountry() {
		return custCountry;
	}

	public void setCustCountry(String custCountry) {
		this.custCountry = custCountry;
	}

	public String getCustEmailAddres() {
		return custEmailAddres;
	}

	public void setCustEmailAddres(String custEmailAddres) {
		this.custEmailAddres = custEmailAddres;
	}

	public String getCustPan() {
		return custPan;
	}

	public void setCustPan(String custPan) {
		this.custPan = custPan;
	}

	public String getCustConstactNo() {
		return custConstactNo;
	}

	public void setCustConstactNo(String custConstactNo) {
		this.custConstactNo = custConstactNo;
	}

	public Date getCustDOB() {
		return custDOB;
	}

	public void setCustDOB(Date custDOB) {
		this.custDOB = custDOB;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
}
