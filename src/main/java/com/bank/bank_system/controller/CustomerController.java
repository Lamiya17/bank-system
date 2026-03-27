package com.bank.bank_system.controller;

import com.bank.bank_system.dto.CustomerDTO;
import com.bank.bank_system.entity.Customer;
import com.bank.bank_system.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping
    public Customer createCustomer(@Validated @RequestBody CustomerDTO customerDTO) {
        return customerService.createCustomer(customerDTO);

    }
}
