package sk.springframework.com.java.model;

import java.time.LocalDate;

public class Pet {
    private PetType petType;
    private Owner petTypeOwner;
    private LocalDate birthDate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getPetTypeOwner() {
        return petTypeOwner;
    }

    public void setPetTypeOwner(Owner petTypeOwner) {
        this.petTypeOwner = petTypeOwner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
