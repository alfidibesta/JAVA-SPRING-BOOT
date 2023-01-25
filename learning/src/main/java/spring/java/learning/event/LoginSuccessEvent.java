package spring.java.learning.event;

import org.springframework.context.ApplicationEvent;

import lombok.Getter;
import spring.java.learning.data.User;

public class LoginSuccessEvent extends ApplicationEvent{

    public LoginSuccessEvent(User user) {
        super(user);
        this.user = user;

    }
    @Getter 
    private final User user;



}
