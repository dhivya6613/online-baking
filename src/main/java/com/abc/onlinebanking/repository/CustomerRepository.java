package com.abc.onlinebanking.repository;
import org.springframework.data.repository.CrudRepository;  
import com.abc.onlinebanking.domain.*;
import javax.persistence.*;

public interface CustomerRepository extends CrudRepository<CustomerDetails, String>  {
	//@Query("SELECT c.name, a.accountNumber, a.accountBalance FROM PERSONS c JOIN c.ACCOUNT p")
	
}
