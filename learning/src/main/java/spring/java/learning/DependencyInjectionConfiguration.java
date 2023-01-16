package spring.java.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.java.learning.data.Bar;
import spring.java.learning.data.Foo;
import spring.java.learning.data.FooBar;

@Configuration
public class DependencyInjectionConfiguration {

    @Bean
    public Foo foo(){
        return new Foo();
    }
    @Bean
    public Bar bar(){
        return new Bar();
    }
    @Bean
    public FooBar fooBar(Foo foo, Bar bar){
        return new FooBar(foo, bar);

    }
}
