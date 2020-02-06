package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotNull(message="Location is required.")
    @NotBlank(message="Location is required.")
    @Size(min=1, max = 100)
    private String location;

    public Employer(String location) {
        super();
        this.location = location;
    }

    //Getters and setters:

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //Setting up one to many relationship
    @OneToMany()
    @JoinColumn
    private List<Job> jobs = new ArrayList<>();

    //No-arg constructor
    public Employer() {}

}


