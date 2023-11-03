package org.application.persistence;

import org.application.logic.Owner;
import org.application.logic.Pet;

public class ControllerJPA {
    
    OwnerJpaController ownerJpa = new OwnerJpaController();
    PetJpaController petJpa = new PetJpaController();

    public void save(Owner owner, Pet pet) {
        ownerJpa.create(owner);
        petJpa.create(pet);
    }
    
}
