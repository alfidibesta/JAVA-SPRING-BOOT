package spring.java.learning;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import lombok.extern.slf4j.Slf4j;
import spring.java.learning.data.Bar;
import spring.java.learning.data.Foo;
import spring.java.learning.scope.DoubletonScope;

@Slf4j
@Configuration
public class ScopeConfiguration {
    
    @Bean
    /* prototype -> membuat object baru setiap kali bean diakses */
    @Scope("prototype")
    public Foo foo(){
        log.info("Create new Prototype");
        return new Foo();
    }

    @Bean
    public CustomScopeConfigurer CustomScopeConfigurer(){
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }

    @Bean
    @Scope("doubleton")
    public Bar bar(){
        log.info("Create new bar");
        return new Bar();
    }
}
