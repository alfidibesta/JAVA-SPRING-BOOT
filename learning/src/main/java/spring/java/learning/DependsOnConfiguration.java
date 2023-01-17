package spring.java.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

import lombok.extern.slf4j.Slf4j;
import spring.java.learning.data.Bar;
import spring.java.learning.data.Foo;

@Slf4j
@Configuration
public class DependsOnConfiguration {
    // lazy digunakan untuk membuat perintah untuk tidak dieksekusi jika itu tidak dibutuhkan
    @Lazy
    @Bean
    // dependsOn digunakan untuk memberikan prioritas pertama dalam proses eksekusi
    @DependsOn({
            "bar"
    })
    public Foo foo() {
        log.info("Create new Foo");
        return new Foo();
    }

    @Bean
    public Bar bar() {
        log.info("Create new Bar");
        return new Bar();
    }
}
