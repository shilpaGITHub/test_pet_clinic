package sk.springframework.com.java.services.map;
import org.springframework.stereotype.Service;
import sk.springframework.com.java.model.Pet;
import sk.springframework.com.java.services.CrudService;

import java.util.Set;
@Service
public class PetServiceMap extends AbstractMapInterface<Pet,Long> implements CrudService<Pet, Long> {
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
        return super.save(object.getId(),object);
    }


}
