package com.abc.onlinebanking.domain;
import java.time.*;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.JoinColumn;
@Entity
@Table(name = "PERSONS")

public class CustomerDetails {
 
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="CUSTOMER_ID")
  private String customerId;
  
  @Column(name = "NAME")
  private String name;
  /*
  @Column(name = "DATE_OF_BIRTH")
  private LocalDate dateOfBirth;
  */
  @Column(name = "ADDRESS")
  private String address;
  
  @Column(name = "CITY")
  private String city;
  /*
  @OneToMany(targetEntity = AccountDetails.class, cascade = CascadeType.ALL)
  @JoinColumn(name = "customer_account", referencedColumnName = "customerId")
  private List<AccountDetails> accountDetails;
  
  /*
  @OneToMany(mappedBy = "AccountDetails", fetch = FetchType.EAGER,
          cascade = CascadeType.ALL)
  
  @JoinTable(name="USERS_ACCOUNT_MAPPING", joinColumns={@JoinColumn(name="MY_CUSTOMER_ID", referencedColumnName="CUSTOMER_ID")}
  , inverseJoinColumns={@JoinColumn(name="MY_ACCOUNT_ID", referencedColumnName="ACCOUNT_ID")})
  
  @JsonManagedReference
  
  private Set<AccountDetails> accountDetails;
  
  public Set<AccountDetails> getAccountDetails() {
	return accountDetails;
  }
  
  public void setAccountDetails(Set<AccountDetails> accountDetails) {
	this.accountDetails = accountDetails;
  }
  */
/*
  @Column(name = "PHONE")
  private long phone;
  */
  public CustomerDetails() {
	  
  }
public CustomerDetails(String customerId, String name, LocalDate dateOfBirth, String address, String city, long phone) {
	super();
	this.customerId = customerId;
	//this.name = name;
	//this.dateOfBirth=dateOfBirth;
	this.address = address;
	this.city = city;
	//this.phone = phone;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
/*
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}*/
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
/*
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public LocalDate getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(LocalDate dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}*/
  
}
