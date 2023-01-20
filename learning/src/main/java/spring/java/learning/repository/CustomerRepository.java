package spring.java.learning.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;

// @Component /* dihapus karena dua bean di customerConfiguration */
public class CustomerRepository {

    @Getter
    @Autowired
    private CustomerRepository customerRepository;
}
