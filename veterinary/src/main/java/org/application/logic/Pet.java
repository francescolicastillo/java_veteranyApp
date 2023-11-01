package main.java.application.logic;

public class Pet {
    private int idPet;
    private String name;
    private String race;
    private String colour;
    private String allergy;
    private String speAtt;
    private String observations;
    private Owner owner;

    public Pet() {
    }

    public Pet(int idPet, String name, String race, String colour, String allergy, String speAtt, String observations, Owner owner) {
        this.idPet = idPet;
        this.name = name;
        this.race = race;
        this.colour = colour;
        this.allergy = allergy;
        this.speAtt = speAtt;
        this.observations = observations;
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(int idPet) {
        this.idPet = idPet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public String getSpeAtt() {
        return speAtt;
    }

    public void setSpeAtt(String speAtt) {
        this.speAtt = speAtt;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
}
