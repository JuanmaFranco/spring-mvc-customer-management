package com.jmfsoft.springmvccustomer.service;

import com.jmfsoft.springmvccustomer.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> findAll();

    public Customer findById(int id);

    public void save(Customer customer);

    public void deleteById(int id);

}
