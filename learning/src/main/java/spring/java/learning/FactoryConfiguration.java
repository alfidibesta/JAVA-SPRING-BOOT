package spring.java.learning;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import spring.java.learning.factory.PaymentGatewayClientFactoryBean;

@Configuration
@Import({
    PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {
    
}
