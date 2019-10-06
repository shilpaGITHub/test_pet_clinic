package sk.springframework.com.java.services;

import sk.springframework.com.java.model.Owner;

import java.util.Set;

public interface OnwerService {
    Owner findById(Long id);
    Owner findByLastName(String name);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
