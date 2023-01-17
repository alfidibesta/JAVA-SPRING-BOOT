package spring.java.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import lombok.extern.slf4j.Slf4j;
import spring.java.learning.data.Bar;
import spring.java.learning.data.Foo;

@Slf4j
@Configuration
public class ScopeConfiguration {
    
    @Bean
    // prototype -> membuat object baru setiap kali bean diakses
    @Scope("prototype")
    public Foo foo(){
        log.info("Create new Prototype");
        return new Foo();
    }

    // @Bean
    // public Bar bar(){
    //     return new Bar();
    // }
}
