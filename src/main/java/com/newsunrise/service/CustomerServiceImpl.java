package com.newsunrise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newsunrise.model.Customer;
import com.newsunrise.repo.CustomerRepoImp;
import com.newsunrise.repo.ICustomerRepo;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
//@AllArgsConstructor
@RequiredArgsConstructor
public class CustomerServiceImpl implements ICustomerService {
	
	//@Autowired
	private final ICustomerRepo repo;

	@Override
	public Customer save(Customer customer) throws Exception {
		return repo.save(customer);
	}

	@Override
	public Customer update(Customer customer, Integer id) throws Exception {
		// TODO Evaluación con el ID
		// API Reflexion
		customer.setIdCustomer(id);
		return repo.save(customer);
	}

	@Override
	public List<Customer> findAll() throws Exception {
		return repo.findAll();
	}

	@Override
	public Customer findById(Integer id) throws Exception {
		return repo.findById(id).orElse(new Customer());
	}

	@Override
	public void delete(Integer id) throws Exception {
		repo.deleteById(id);
	}
	
	
	
	
	/*
	public CustomerService(CustomerRepo repo) {
		this.repo = repo;
	}
	 */
	/*
	@Override
	public Customer validAndSave(Customer customer) {
		//repo = new CustomerRepo();
		if(customer.getIdCustomer()>0) {
			return repo.save(customer);
		}else {
			return new Customer();
		}
	}
	*/
}
