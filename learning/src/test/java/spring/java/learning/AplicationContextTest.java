package spring.java.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AplicationContextTest {
    @Test
    void testApplication() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BelajarHelloWorldConfiguration.class);

        Assertions.assertNotNull(context);
    }
}
