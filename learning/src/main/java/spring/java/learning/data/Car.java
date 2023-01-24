package spring.java.learning.data;

import org.springframework.stereotype.Component;

import lombok.Getter;
import spring.java.learning.aware.IdAware;

@Component
public class Car implements IdAware{
    @Getter
    private String id;

    @Override
    public void setId(String id){
        this.id = id;
    }
}
