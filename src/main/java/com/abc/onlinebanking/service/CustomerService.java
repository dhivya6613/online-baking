package com.abc.onlinebanking.service;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service; 
import com.abc.onlinebanking.domain.*;
import com.abc.onlinebanking.repository.*;

@Service  
public class CustomerService {
	@Autowired  
	CustomerRepository customerRepository;  
	
	//getting all student records  
	public List<CustomerDetails> getAllCustomer()   
	{  
		List<CustomerDetails> customers = new ArrayList<CustomerDetails>();  
		customerRepository.findAll().forEach(customer -> customers.add(customer));  
		return customers;  
	}  
	
	//getting a specific record  
	public CustomerDetails getCustomerById(int id)   
	{  
		return customerRepository.findById(id).get();  
	}  
	public void saveOrUpdate(CustomerDetails customer)   
	{  
		customerRepository.save(customer);  
	}  
	//deleting a specific record  
	public void delete(int id)   
	{  
		customerRepository.deleteById(id);  
	}  
}
