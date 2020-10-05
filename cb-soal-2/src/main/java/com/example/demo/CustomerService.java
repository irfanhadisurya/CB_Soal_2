package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
	private CustomerRepository custRepo;
	
	
	public List<Customer> getAllCustomer(){
		
		List<Customer> customers = new ArrayList<>();
		custRepo.findAll()
		.forEach(customers::add);
		
		return customers;
		
	}
	
	public Customer getCustomer(Integer id) {
		return custRepo.findById(id).get();
		
	}
	
	
	public void addCustomer(Customer customer) {
		custRepo.save(customer);
	}
	
	public void updateCustomer(int id, Customer customer) {
		custRepo.save(customer);
	}
	
	
	public void deleteCustomer(int id) {
		custRepo.deleteById(id);
	}
	
	
}
