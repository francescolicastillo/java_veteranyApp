package org.application.logic;

import java.util.List;
import org.application.persistence.ControllerJPA;

public class Controller {
    
    ControllerJPA controlPersis = new ControllerJPA();

    public void save(String name, String race, String colour, String ownerName, String phone, String observation, String allergy, String speAtte) {
        Owner owner = new Owner();
        owner.setName(ownerName);
        owner.setPhone(phone);
        
        Pet pet = new Pet();
        pet.setName(name);
        pet.setRace(race);
        pet.setColour(colour);
        pet.setObservations(observation);
        pet.setAllergy(allergy);
        pet.setSpeAtt(speAtte);
        pet.setOwner(owner);
        
        controlPersis.save(owner,pet);
    }

    public List<Pet> getAllPets() {
        return controlPersis.getAllPets();
    }

    public Pet getPet(int index) {
        return controlPersis.getPetById(index);
    }

    public void saveChanges(int idPet, int idOwner, String name, String race, String colour, String ownerName, String phone, String observation, String allergy, String speAtte) {
        Owner owner = new Owner();
        owner.setIdOwner(idOwner);
        owner.setName(ownerName);
        owner.setPhone(phone);
        
        Pet pet = new Pet();
        pet.setIdPet(idPet);
        pet.setName(name);
        pet.setRace(race);
        pet.setColour(colour);
        pet.setObservations(observation);
        pet.setAllergy(allergy);
        pet.setSpeAtt(speAtte);
        pet.setOwner(owner);
        
        controlPersis.put(owner,pet);
    }

    public void deleteClient(int idClient) {
        controlPersis.deleteClient(idClient);
    }
}
