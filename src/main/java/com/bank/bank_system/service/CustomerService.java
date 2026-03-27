package com.bank.bank_system.service;

import com.bank.bank_system.dto.CustomerDTO;
import com.bank.bank_system.entity.Customer;
import com.bank.bank_system.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public Customer createCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        customer.setCustomerNo(customerDTO.getCustomerNo());
        customer.setFullName(customerDTO.getFullName());
        customer.setMobileNumber(customerDTO.getMobileNo());
        customer.setFullName("John");
        customer.setLocalBranch("001");
        customer.setAddressLine1("Baku");
        customer.setCustomerType("Individual");
        customer.setRecordStat("Active");
        return customerRepository.save(customer);
    }
}
