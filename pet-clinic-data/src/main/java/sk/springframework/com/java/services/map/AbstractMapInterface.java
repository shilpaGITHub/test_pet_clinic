package sk.springframework.com.java.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapInterface<T,ID> {

    protected Map<ID,T> map = new HashMap<>();

    Set<T> findAll(){
       return new HashSet<>(map.values());
    }

    T findByID(ID id){
       return map.get(id);
    }

    T save(T object,ID id){
        map.put(id,object);
        return object;
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    void deleteById(ID id){
        map.remove(id);
    }
}
