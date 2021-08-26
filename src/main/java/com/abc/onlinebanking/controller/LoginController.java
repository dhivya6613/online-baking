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
import com.abc.onlinebanking.domain.LoginDetails;  
import com.abc.onlinebanking.service.LoginService; 

//creating RestController  
@RestController  

public class LoginController {
	//autowired the StudentService class  
	@Autowired  
	LoginService loginService; 
	
	//creating a get mapping that retrieves all the students detail from the database   
	@GetMapping("/LoginDetails") 
	private List<LoginDetails> getAllLogin()   
	{  
		return loginService.getAllLogin();  
	}  
	
	//creating a get mapping that retrieves the detail of a specific student  
	@GetMapping("/LoginDetails/{id}")  
	private LoginDetails getLogin(@PathVariable("id") String id)   
	{  
		return loginService.getLoginById(id);  
	}  
	
	//creating a delete mapping that deletes a specific student  
	@DeleteMapping("/LoginDetails/{id}")  
	private void deleteLogin(@PathVariable("id") String id)   
	{  
		loginService.delete(id);  
	}  
	
	//creating post mapping that post the student detail in the database  
	@PostMapping("/LoginDetails")  
	private String saveLogin(@RequestBody LoginDetails login)   
	{  
		loginService.saveOrUpdate(login); 
		return "value saved";
		//return CustomerService.getCustomerId();  
	}
	
}
