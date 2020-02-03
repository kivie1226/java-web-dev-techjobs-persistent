package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message="Description required.")
    private String description;


    public void setDescription(String description) {
        this.description = description;
    }

    //Getter and setter:
    
    public String getDescription() {
        return description;
    }
    public Skill(String description) {
        this.description = description;
    }


    //No-arg constructor:

    public Skill() {}

}

