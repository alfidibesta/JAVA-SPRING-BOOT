package spring.java.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.java.learning.data.Connection;
import spring.java.learning.data.Server;

@Configuration
public class LifeCycleConfiguration {
    
    @Bean
    public Connection connection(){
        return new Connection();
    } 

    // @Bean(initMethod = "start", destroyMethod = "stop") /* with init and destroy method */
    @Bean /* without init because pada data sudah ada preDestroy dan postConstract */
    public Server server(){
        return new Server();
    }
}
