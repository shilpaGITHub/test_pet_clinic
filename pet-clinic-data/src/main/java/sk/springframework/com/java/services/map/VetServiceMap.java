package sk.springframework.com.java.services.map;

import org.springframework.stereotype.Service;
import sk.springframework.com.java.model.Vet;
import sk.springframework.com.java.services.VetService;

import java.util.Set;
@Service
public class VetServiceMap extends AbstractMapInterface<Vet,Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet findById(Long aLong) {
        return super.findByID(aLong);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }


}
