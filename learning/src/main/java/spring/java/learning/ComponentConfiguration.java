package spring.java.learning;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "spring.java.learning.service",
    "spring.java.learning.repository",
    "spring.java.learning.configuration"
})
public class ComponentConfiguration {
    
}
