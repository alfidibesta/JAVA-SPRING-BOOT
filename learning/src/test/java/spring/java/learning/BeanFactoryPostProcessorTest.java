package spring.java.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import spring.java.learning.data.Foo;
import spring.java.learning.processor.FooBeanFactoryPostProcessor;

public class BeanFactoryPostProcessorTest {
    
    @Configuration
    @Import(
        FooBeanFactoryPostProcessor.class
    )
    public static class TestConfiguration{

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testBeanfactorPostProcessor(){
        Foo foo = applicationContext.getBean(Foo.class);
        Assertions.assertNotNull(foo);


    }
}
