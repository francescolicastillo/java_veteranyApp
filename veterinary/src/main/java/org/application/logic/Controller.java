package org.application.logic;

import java.util.List;
import org.application.persistence.ControllerJPA;

public class Controller {
    
    ControllerJPA controlPersis = new ControllerJPA();

    public void save(String name, String race, String colour, String ownerName, String phone, 
            String observation, String allergy, String speAtte) {
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

    public List<Owner> loadOwner() {
        
    }
}
