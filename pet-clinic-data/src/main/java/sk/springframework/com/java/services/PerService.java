package sk.springframework.com.java.services;


import sk.springframework.com.java.model.Pet;

import java.util.Set;

public interface PerService{
        Pet findById(Long id);
        Pet save(Pet pet);
        Set<Pet> findAll();
}
