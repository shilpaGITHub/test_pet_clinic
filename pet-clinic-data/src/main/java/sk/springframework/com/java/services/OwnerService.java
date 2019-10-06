package sk.springframework.com.java.services;

import sk.springframework.com.java.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
   Owner findByLastName(String name);
}
