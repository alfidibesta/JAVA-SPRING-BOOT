package spring.java.learning;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "spring.java.learning.configuration"
})
public class ScanConfiguration {
    

}
