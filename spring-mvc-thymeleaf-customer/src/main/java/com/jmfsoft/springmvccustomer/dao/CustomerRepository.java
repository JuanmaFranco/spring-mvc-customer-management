package com.jmfsoft.springmvccustomer.dao;

import com.jmfsoft.springmvccustomer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
