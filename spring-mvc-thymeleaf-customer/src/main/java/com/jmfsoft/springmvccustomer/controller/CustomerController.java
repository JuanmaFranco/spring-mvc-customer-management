package com.jmfsoft.springmvccustomer.controller;

import com.jmfsoft.springmvccustomer.entity.Customer;
import com.jmfsoft.springmvccustomer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/list")
    public String listCustomers(Model theModel) {
        List<Customer> customers = customerService.findAll();
        theModel.addAttribute("customers", customers);
        return "list-customers";
    }

}
