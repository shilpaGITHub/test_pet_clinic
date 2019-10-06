package sk.springframework.com.java.services.map;

import sk.springframework.com.java.model.Person;
import sk.springframework.com.java.services.CrudService;

import java.util.Set;

public class PersonServiceMap  extends AbstractMapInterface<Person,Long> implements CrudService<Person,Long> {
    @Override
    public Set<Person> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Person object) {
        super.delete(object);
    }

    @Override
    public Person findById(Long aLong) {
        return super.findByID(aLong);
    }

    @Override
    public Person save(Person object) {
        return super.save(object,object.getId());
    }

}
