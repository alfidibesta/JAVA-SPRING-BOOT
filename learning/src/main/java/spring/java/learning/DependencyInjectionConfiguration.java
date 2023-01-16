package spring.java.learning;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import spring.java.learning.data.Bar;
import spring.java.learning.data.Foo;
import spring.java.learning.data.FooBar;

@Configuration
public class DependencyInjectionConfiguration {

    @Primary
    @Bean
    public Foo fooFirst(){
        return new Foo();
    }
    @Bean
    public Foo fooSecond(){
        return new Foo();
    }
    @Bean
    public Bar bar(){
        return new Bar();
    }
    @Bean
    public FooBar fooBar(@Qualifier("fooSecond") Foo foo, Bar bar){
        return new FooBar(foo, bar);

    }
}
