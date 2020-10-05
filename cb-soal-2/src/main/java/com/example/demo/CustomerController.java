package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService custService;
	
	
	@RequestMapping("/customers")
	public List<Customer> getAllCustomer(){
		
		return custService.getAllCustomer();
	}
	
	@RequestMapping("/customers/{id}")
	public Customer getCustomer(Integer id){
		
		return custService.getCustomer(id);
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/customers")
	public void addCustomer(@RequestBody Customer customer){
		
		custService.addCustomer(customer);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT, value="/customers/{id}")
	public void addCustomer(@RequestBody Customer customer, @PathVariable Integer id){
		
		custService.updateCustomer(id, customer);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/customers/{id}")
	public void addCustomer(@PathVariable Integer id){
		
		custService.deleteCustomer(id);
	}

}
