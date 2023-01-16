package spring.java.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import spring.java.learning.data.Foo;

@Configuration
public class BeanNameConfiguration {
    @Primary
    @Bean(name = "fooFirst")
    public Foo foo1(){
        return new Foo();
    }
    @Bean(name = "fooSecond")
    public Foo foo2(){
        return new Foo();
    }    
}
