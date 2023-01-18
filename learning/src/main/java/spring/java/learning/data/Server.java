package spring.java.learning.data;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Server {

    @PostConstruct /* digunakan jika pada bean configuration tidak implemet method initial*/
    public void start() {
        log.info("Start server.");
    }

    @PreDestroy /* digunakan jika pada bean configuration tidak implemet method destroy*/
    public void stop() {
        log.info("Stop server.");
    }
}
