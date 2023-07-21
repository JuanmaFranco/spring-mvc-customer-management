package com.jmfsoft.springmvccustomer.dao;

import com.jmfsoft.springmvccustomer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
