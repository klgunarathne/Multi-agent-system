package com.example.agnents.controllers;

import java.util.Optional;

import com.example.agnents.models.Customer;
import com.example.agnents.repositories.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
@CrossOrigin(origins = "*")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("")
    @Async
    public Iterable<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @PostMapping("")
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @DeleteMapping("/delete")
    public void deleteCustomer(Customer customer) {
        customerRepository.delete(customer);
    }

    @GetMapping("/{customerId}")
    @Async
    public Optional<Customer> findCustomer(long customerid) {
        return customerRepository.findById(customerid);
    }
}
