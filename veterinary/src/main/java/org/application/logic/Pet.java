package org.application.logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Pet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idPet;
    private String name;
    private String race;
    private String colour;
    private String allergy;
    private String speAtt;
    private String observations;
    @OneToOne
    private Owner owner;
    @OneToMany
    private List<Appointment> appointments = new ArrayList<>();

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

    public List<Appointment> getAppointments() {
        return appointments;
    }
    
    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public void addAppointments(Appointment appointment) {
        this.appointments.add(appointment);
    }
    
    public void delete(Appointment appointment){
        this.appointments.remove(appointment);
    }
    
}
