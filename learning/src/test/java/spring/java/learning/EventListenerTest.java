package spring.java.learning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import spring.java.learning.listener.LoginAgainSucessListener;
import spring.java.learning.listener.LoginSucessListener;
import spring.java.learning.service.UserService;

public class EventListenerTest {
    
    @Component
    @Import({
        UserService.class,
        LoginSucessListener.class,
        LoginAgainSucessListener.class
    })
    public static class TestConfiguration{

    }

    private ConfigurableApplicationContext applicationContext;


    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testEventListener(){
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login("eko","123");
        userService.login("123","eko");
        userService.login("eko","eko");

    }
}
