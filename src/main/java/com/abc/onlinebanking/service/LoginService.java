package com.abc.onlinebanking.service;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.abc.onlinebanking.domain.*;
import com.abc.onlinebanking.repository.*;

@Service 
public class LoginService {
	
	@Autowired  
	LoginRepository loginRepository;
	
	//all business logics
	//validation
	
	public List<LoginDetails> getAllLogin()   
	{  
		List<LoginDetails> logins = new ArrayList<LoginDetails>();  
		loginRepository.findAll().forEach(login -> logins.add(login));  
		return logins;  
	}  
	
	//getting a specific record  
	public LoginDetails getLoginById(String id)   
	{  
		return loginRepository.findById(id).get();  
	}  
	public void saveOrUpdate(LoginDetails login)   
	{  
		loginRepository.save(login);  
	}  
	//deleting a specific record  
	public void delete(String id)   
	{  
		loginRepository.deleteById(id);  
	}  
}
