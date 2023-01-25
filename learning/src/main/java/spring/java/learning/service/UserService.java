package spring.java.learning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import spring.java.learning.data.User;
import spring.java.learning.event.LoginSuccessEvent;
import spring.java.learning.listener.LoginSucessListener;

@Component
public class UserService implements ApplicationEventPublisherAware{
    
    private ApplicationEventPublisher applicationEventPublisher;

    // @Autowired
    // private LoginSucessListener loginSucessListener;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
        
    }

    public boolean login(String username, String password){
        if (isLoginSucess(username, password)) {
            /*tanpa autowired */
            applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(username))); 

            /*menggunakan autowired tidak rekomen, karena akan banyak code jika listenernya banyak */
            // loginSucessListener.onApplicationEvent(new LoginSuccessEvent(new User(username))); 
            // loginSucessListener.onApplicationEvent(new LoginSuccessEvent(new User(username))); /*contoh */
            // loginSucessListener.onApplicationEvent(new LoginSuccessEvent(new User(username))); /*contoh */
            // loginSucessListener.onApplicationEvent(new LoginSuccessEvent(new User(username))); /*contoh */
            // loginSucessListener.onApplicationEvent(new LoginSuccessEvent(new User(username))); /*contoh */
            // loginSucessListener.onApplicationEvent(new LoginSuccessEvent(new User(username))); /*contoh */
            return true;
        }else{
            return true;
        }
    }

    private boolean isLoginSucess(String username, String password) {
        return "eko".equals(username) && "eko".equals(password); 
    }


}
