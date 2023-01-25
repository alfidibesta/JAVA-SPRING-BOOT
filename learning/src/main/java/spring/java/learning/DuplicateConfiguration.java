package spring.java.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.java.learning.data.Foo;

@Configuration
public class DuplicateConfiguration {

    @Bean
    public Foo foo1(){
        return new Foo();
    }
    @Bean
    public Foo foo2(){
        return new Foo();
    }
}
