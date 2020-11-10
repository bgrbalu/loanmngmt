package com.loan.mngmt.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;


@Entity
@Data
public class CustDetails implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	@Column(name = "ACCOUNT_NUMBER")
	private Integer accountNumber;
	
	@Column(name = "CUST_NAME")
	private String custName;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "USER_PASSWORD")
	private String userPassword;
	
	@Column(name = "CUST_ADDRESS")
	private String custAddress;
	
	@Column(name = "CUST_STATE")
	private String custState;
	
	@Column(name = "CUST_COUNTRY")
	private String custCountry;
	
	@Column(name = "CUST_EMAIL_ADDRES")
	private String custEmailAddres;
	
	@Column(name = "CUST_PAN")
	private String custPan;
	
	@Column(name = "CUST_CONTACT_NO")
	private String custContactNo;
	
	@Column(name = "CUSTDOB")
	private Date custDOB;
	
	@Column(name = "ACCOUNT_TYPE")
	private String accountType;
	
	
}
