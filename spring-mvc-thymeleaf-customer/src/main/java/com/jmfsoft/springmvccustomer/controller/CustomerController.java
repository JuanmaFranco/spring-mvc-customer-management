package com.jmfsoft.springmvccustomer.controller;

import com.jmfsoft.springmvccustomer.entity.Customer;
import com.jmfsoft.springmvccustomer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        return "/customers/list-customers";
    }

    @GetMapping("/showAddForm")
    public String showAddForm(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "customers/customer-form";
    }

    @PostMapping("/save")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.save(customer);
        return "redirect:/customers/list";
    }

    @GetMapping("/showUpdateForm")
    public String showUpdateForm(@RequestParam("customerId") int id, Model model) {
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        return "customers/customer-form";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("customerId") int id) {
        customerService.deleteById(id);
        return "redirect:/customers/list";
    }

}
