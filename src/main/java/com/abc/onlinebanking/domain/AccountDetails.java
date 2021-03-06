package com.abc.onlinebanking.domain;
import java.time.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "ACCOUNT")

public class AccountDetails {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ACCOUNT_ID")
	private String accountNumber;
	
	@Column(name = "ACC_BALANCE")
	private float accountBalance;
	
	@Column(name = "DATE_CREATED")
	private LocalDate dateCreated;
	
	 @JsonBackReference
	 @ManyToOne
	 private CustomerDetails customerDetails;
	 
	public AccountDetails(String accountNumber, float accountBalance, LocalDate dateCreated) {
		super();
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.dateCreated = dateCreated;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public float getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}
	public LocalDate getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	
}
