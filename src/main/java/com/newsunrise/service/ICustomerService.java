package com.newsunrise.service;

import java.util.List;

import com.newsunrise.model.Customer;

public interface ICustomerService {
	//Customer validAndSave(Customer customer);
	Customer save(Customer customer) throws Exception;
	Customer update(Customer customer, Integer id) throws Exception;
	List<Customer> findAll() throws Exception;
	Customer findById(Integer id) throws Exception;
	void delete(Integer id) throws Exception;
}
