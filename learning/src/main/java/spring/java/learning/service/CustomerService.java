package spring.java.learning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Getter;
import spring.java.learning.repository.CustomerRepository;

@Component
public class CustomerService {
    
    /*Dependencies Injection */
    @Getter
    @Autowired
    private CustomerRepository customerRepository;


    /* Qualifier */
    @Getter
    @Autowired
    @Qualifier("normalCustomerRepository")
    private CustomerRepository normalCustomerRepository;
    
    @Getter
    @Autowired
    @Qualifier("premiumCustomerRepository")
    private CustomerRepository premiumCustomerRepository;
}

