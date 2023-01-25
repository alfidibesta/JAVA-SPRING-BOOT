package spring.java.learning.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import spring.java.learning.event.LoginSuccessEvent;

@Component
@Slf4j
public class LoginSucessListener implements ApplicationListener<LoginSuccessEvent>{

    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        log.info("Sucess login for user {}", event.getUser());
        
    }
    
}
