package spring.java.learning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import spring.java.learning.repository.CustomerRepository;

@Component
public class CustomerService {
    
    @Getter
    @Autowired
    private CustomerRepository customerRepository;
}

