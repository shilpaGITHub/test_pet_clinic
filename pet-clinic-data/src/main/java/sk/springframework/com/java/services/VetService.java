package sk.springframework.com.java.services;

import sk.springframework.com.java.model.Pet;
import sk.springframework.com.java.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Pet pet);
    Set<Vet> findAll();
}
