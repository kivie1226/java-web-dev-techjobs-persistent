package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {
    @NotNull(message="Location is required.")
    @Size(max = 1, message = "Employers can only have one location.")
    public String location;

    //Getters and setters:

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //No-arg constructor
    public Employer() {}

}


