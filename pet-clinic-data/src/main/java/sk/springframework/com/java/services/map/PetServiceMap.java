package sk.springframework.com.java.services.map;

import sk.springframework.com.java.model.Pet;
import sk.springframework.com.java.services.PerService;

import java.util.Set;

public class PetServiceMap extends AbstractMapInterface<Pet,Long> implements PerService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet findById(Long aLong) {
        return super.findByID(aLong);
    }

    @Override
    public Pet save(Pet object) {
        return null;
    }


}
