package org.application.persistence;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.application.logic.Owner;
import org.application.logic.Pet;
import org.application.persistence.exceptions.NonexistentEntityException;

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

    public Pet getPetById(int index) {
        return petJpa.findPet(index);
    }

    public void put(Owner owner, Pet pet) {
        try {
            ownerJpa.edit(owner);
            petJpa.edit(pet);
        } catch (Exception ex) {
            Logger.getLogger(ControllerJPA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteClient(int idClient) {
        try {
            int idOwner = petJpa.findPet(idClient).getOwner().getIdOwner();
            petJpa.destroy(idClient);
            ownerJpa.destroy(idOwner);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerJPA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
