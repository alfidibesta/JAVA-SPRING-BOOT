package spring.java.learning.scope;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.lang.Nullable;

public class DoubletonScope implements Scope {

    private List<Object> objects = new ArrayList<>(2);

    private Long counter = -1L;

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        
        counter ++;

        if(objects.size() == 2 ){
            int index = (int) (counter % 2);
            return objects.get(index);
        } else{
             Object object = objectFactory.getObject();
             objects.add(object);
             return object; 
        }
    }

    @Override
    public Object remove(String arg0) {
        

        if(!objects.isEmpty()){
            objects.remove(0);
        }
        return null;
    }

    @Override
    @Nullable
    public String getConversationId() {
        return null;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {
        
    }

    @Override
    @Nullable
    public Object resolveContextualObject(String arg0) {
        return null;
    }
}
