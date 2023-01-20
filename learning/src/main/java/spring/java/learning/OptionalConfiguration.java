package spring.java.learning;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.java.learning.data.Bar;
import spring.java.learning.data.Foo;
import spring.java.learning.data.FooBar;

@Configuration
public class OptionalConfiguration {
    
    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar){
        return new FooBar(foo.orElse(null), bar.orElse(null));
    }
}
