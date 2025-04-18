package com.newsunrise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newsunrise.model.Customer;
import com.newsunrise.service.CustomerServiceImpl;
import com.newsunrise.service.ICustomerService;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/customers")
//@AllArgsConstructor
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class CustomerController {
	//@Autowired
	private final ICustomerService service;
	//private String text;
	
	@GetMapping
	public List<Customer> findAll() throws Exception{
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Customer findById(@PathVariable("id") Integer id) throws Exception{
		return service.findById(id);
	}
	
	@PostMapping
	public Customer save(@RequestBody Customer customer) throws Exception{
		return service.save(customer);
	}
	
	@PutMapping("/{id}")
	public Customer update(@PathVariable("id") Integer id, @RequestBody Customer customer) throws Exception{
		return service.update(customer, id);
	}
	
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable("id") Integer id) throws Exception{
		service.delete(id);
	}
	
	
	
	/*
	public CustomerController(CustomerService service) {
		this.service = service;
	}
	*/
	
	/*
	
	@GetMapping
	public Customer saveCustomer() {
		//service = new CustomerService();
		Customer customer = new Customer();
		//customer.setIdCustomer(1);
		//customer.setNombre("Carlos Vega");
		return service.validAndSave(customer);
	}	
	*/
	
	/*@GetMapping
	public Customer showCustomer() {
		return new Customer(1, "Carlos Fernandez");
	}*/
}

	
	
