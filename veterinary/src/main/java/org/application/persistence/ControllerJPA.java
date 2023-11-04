package org.application.persistence;

import java.util.List;
import org.application.logic.Owner;
import org.application.logic.Pet;

public class ControllerJPA {
    
    OwnerJpaController ownerJpa = new OwnerJpaController();
    PetJpaController petJpa = new PetJpaController();

    public void save(Owner owner, Pet pet) {
        ownerJpa.create(owner);
        petJpa.create(pet);
    }

    public List<Pet> getAllPets() {
        return petJpa.findPetEntities();
    }
    
}
