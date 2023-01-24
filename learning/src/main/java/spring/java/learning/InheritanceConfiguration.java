package spring.java.learning;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import spring.java.learning.service.MerchantServiceImpl;

@Component
@Import(MerchantServiceImpl.class)
public class InheritanceConfiguration {
    
}
