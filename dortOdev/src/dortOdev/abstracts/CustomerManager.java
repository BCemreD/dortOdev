package dortOdev.abstracts;

import dortOdev.entities.Customer;
import dortOdev.interfaces.CustomerService;

public class CustomerManager implements CustomerService{

	@Override
	public void add(Customer customer) {
		System.out.println(customer.getName() + " ba�ar�l� bir �ekilde kaydedildi.");
	
		
	}

}
