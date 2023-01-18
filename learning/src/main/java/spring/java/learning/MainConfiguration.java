package spring.java.learning;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import spring.java.learning.configuration.BarConfiguration;
import spring.java.learning.configuration.FooConfiguration;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})

public class MainConfiguration {
    
}
