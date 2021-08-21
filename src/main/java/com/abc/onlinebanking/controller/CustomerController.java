package com.abc.onlinebanking.controller;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  
import com.abc.onlinebanking.domain.CustomerDetails;  
import com.abc.onlinebanking.service.CustomerService;  

//creating RestController  
@RestController 

public class CustomerController {
	//autowired the StudentService class  
	
	@Autowired  
	CustomerService customerService;  
	
	//creating a get mapping that retrieves all the students detail from the database   
	@GetMapping("/CustomerDetails")  
	private List<CustomerDetails> getAllCustomer()   
	{  
		return customerService.getAllCustomer();  
	}  
	
	//creating a get mapping that retrieves the detail of a specific student  
	@GetMapping("/CustomerDetails/{id}")  
	private CustomerDetails getCustomer(@PathVariable("id") int id)   
	{  
		return customerService.getCustomerById(id);  
	}  
	
	//creating a delete mapping that deletes a specific student  
	@DeleteMapping("/CustomerDetails/{id}")  
	private void deleteCustomer(@PathVariable("id") int id)   
	{  
		customerService.delete(id);  
	}  
	
	//creating post mapping that post the student detail in the database  
	@PostMapping("/CustomerDetails")  
	private String saveCustomer(@RequestBody CustomerDetails customer)   
	{  
		customerService.saveOrUpdate(customer); 
		return "value saved";
		//return CustomerService.getCustomerId();  
	}
}
