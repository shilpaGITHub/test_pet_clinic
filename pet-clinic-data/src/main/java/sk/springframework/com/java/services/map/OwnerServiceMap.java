package sk.springframework.com.java.services.map;


import org.springframework.stereotype.Service;
import sk.springframework.com.java.model.Owner;
import sk.springframework.com.java.services.OwnerService;

import java.util.Set;
@Service
public class OwnerServiceMap extends AbstractMapInterface<Owner,Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner findById(Long aLong) {
        return super.findByID(aLong);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }


    @Override
    public Owner findByLastName(String name) {
        return null;
    }
}
