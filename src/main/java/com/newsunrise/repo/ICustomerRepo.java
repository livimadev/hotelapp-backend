package com.newsunrise.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newsunrise.model.Customer;

public interface ICustomerRepo extends JpaRepository<Customer, Integer> {
	// Customer save(Customer customer);
}
