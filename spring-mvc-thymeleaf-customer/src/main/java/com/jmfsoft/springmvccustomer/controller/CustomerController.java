package com.jmfsoft.springmvccustomer.controller;

import com.jmfsoft.springmvccustomer.entity.Customer;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    private List<Customer> customers = new ArrayList<>();

    @PostConstruct
    private void loadData() {

        Customer emp1 = new Customer("Leslie", "Andrews", "leslie@hotmail.com");
        Customer emp2 = new Customer("Emma", "Baumgarten", "emma@hotmail.com");
        Customer emp3 = new Customer("Avani", "Gupta", "avani@hotmail.com");

        customers.add(emp1);
        customers.add(emp2);
        customers.add(emp3);
    }

    @GetMapping("/list")
    public String listCustomers(Model theModel) {
        theModel.addAttribute("customers", customers);
        return "list-customers";
    }
}
